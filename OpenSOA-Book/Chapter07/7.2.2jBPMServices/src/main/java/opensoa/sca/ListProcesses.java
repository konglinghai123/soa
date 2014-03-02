package opensoa.sca;

import opensoa.sca.vo.xsd.ProcessVOType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface ListProcesses {
	public ProcessVOType listProcesses ();
}
