package opensoa.sca;

import opensoa.sca.vo.xsd.ProcessInstanceVOType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface ListProcessInstances {
	public ProcessInstanceVOType listProcessInstances (long id, String filter);
}
