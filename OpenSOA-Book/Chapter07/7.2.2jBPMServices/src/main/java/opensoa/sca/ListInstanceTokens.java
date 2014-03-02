package opensoa.sca;

import opensoa.sca.vo.xsd.TokensType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface ListInstanceTokens {
	public TokensType listInstanceTokens (long id, String filter);
}
