
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.event.map.MapEventBean;


import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import junit.framework.Assert;

public class SupportUpdateListener8_51 implements UpdateListener
{
    private List<EventBean[]> newDataList;
    private List<EventBean[]> oldDataList;

    private EventBean[] lastNewData;
    private EventBean[] lastOldData;
    private boolean isInvoked;

    public SupportUpdateListener8_51()
    {
        newDataList = new LinkedList<EventBean[]>();
        oldDataList = new LinkedList<EventBean[]>();
    }

    public void update(EventBean[] newData, EventBean[] oldData)
    {
    
    	MapEventBean bean;
    	if (newData != null) {
    		bean = (MapEventBean) newData[0];
    		System.out.println("newData: " + newData[0].toString());
    		if (bean.getEventType().isProperty("size"))    	
    			System.out.println("size: " +  newData[0].get("size"));
    		else
    			System.out.println("otherwise" + newData[0].toString());
    	}
    
    	//System.out.println("update called: " + newData[0].get("processName"));
        this.oldDataList.add(oldData);
        this.newDataList.add(newData);

        this.lastNewData = newData;
        this.lastOldData = oldData;

        isInvoked = true;
    }
    
    public void updateRStream(Map row)
    {
    	System.out.println("in updateRStream");
    }    

    public void reset()
    {
        this.oldDataList.clear();
        this.newDataList.clear();
        this.lastNewData = null;
        this.lastOldData = null;
        isInvoked = false;
    }

    public EventBean[] getLastNewData()
    {
        return lastNewData;
    }

    public EventBean[] getAndResetLastNewData()
    {
        EventBean[] lastNew = lastNewData;
        lastNewData = null;
        return lastNew;
    }

    public EventBean[] getLastOldData()
    {
        return lastOldData;
    }

    public List<EventBean[]> getNewDataList()
    {
        return newDataList;
    }

    public List<EventBean[]> getOldDataList()
    {
        return oldDataList;
    }

    public boolean isInvoked()
    {
        return isInvoked;
    }

    public boolean getAndClearIsInvoked()
    {
        boolean invoked = isInvoked;
        isInvoked = false;
        return invoked;
    }

    public void setLastNewData(EventBean[] lastNewData)
    {
        this.lastNewData = lastNewData;
    }

    public void setLastOldData(EventBean[] lastOldData)
    {
        this.lastOldData = lastOldData;
    }

    public EventBean assertOneGetNewAndReset()
    {
        Assert.assertTrue(isInvoked);

        Assert.assertEquals(1, newDataList.size());
        Assert.assertEquals(1, oldDataList.size());

        Assert.assertEquals(1, lastNewData.length);
        Assert.assertNull(lastOldData);

        EventBean lastNew = lastNewData[0];
        reset();
        return lastNew;
    }    
}
