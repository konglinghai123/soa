package opensoa.sca;

import opensoa.sca.vo.xsd.ActorTasksType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface ListActorTasks {
	public ActorTasksType listActorTasks (String actorId, String filter);
}
