package opensoa.sca;

import opensoa.sca.vo.xsd.TasksType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface ListInstanceTasks {
	public TasksType listInstanceTasks (long id, String filter);
}
