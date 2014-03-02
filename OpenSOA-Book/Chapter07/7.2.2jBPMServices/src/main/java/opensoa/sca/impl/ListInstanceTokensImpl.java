package opensoa.sca.impl;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import opensoa.sca.JBPMHelper;
import opensoa.sca.ListInstanceTokens;
import opensoa.sca.vo.xsd.TokenVO;
import opensoa.sca.vo.xsd.TokensType;
import opensoa.sca.vo.xsd.XsdFactory;
import opensoa.sca.vo.xsd.comment;
import opensoa.sca.vo.xsd.comments;
import opensoa.sca.vo.xsd.tokenStatuses;
import opensoa.sca.vo.xsd.tokenTransition;
import opensoa.sca.vo.xsd.tokenTransitions;
import org.apache.tuscany.sdo.api.SDOUtil;
import org.jbpm.JbpmContext;
import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.def.Transition;
import org.jbpm.graph.exe.Comment;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.graph.exe.Token;
import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;
import commonj.sdo.helper.HelperContext;

@Service(ListInstanceTokens.class)
public class ListInstanceTokensImpl implements ListInstanceTokens {

	@Reference
	protected JBPMHelper jbpmContextHelper;

	private final static String OPEN = "OPEN";
	private final static String ALL = "ALL";
	private final static String SUSPENDED = "SUSPENDED";
	private final static String ENDED = "ENDED";

	public TokensType listInstanceTokens(long id, String filter) {

		XsdFactory factory = XsdFactory.INSTANCE;
		HelperContext scope = SDOUtil.createHelperContext();
		XsdFactory.INSTANCE.register(scope);
		
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();

		TokensType returnTokens = (TokensType) factory.createTokensType();
		TokenVO returnToken;
		
		if (jbpmContext.getGraphSession().getProcessInstance(id) == null) {
			return returnTokens;
		}
		long processId = jbpmContext.getGraphSession().getProcessInstance(id).getProcessDefinition().getId();
		
		ProcessInstance instance = jbpmContext.getGraphSession().getProcessInstance(id);
		

		
		List<Token> tokens = instance.findAllTokens();
		Token token;
		comments comments;
		comment comment;
		Comment jcomment;
		tokenStatuses statuses;
		Transition transition;
		tokenTransitions returnTransitions;
		tokenTransition  returnTransition;
		Set <Transition> transitions;
		
		for (Iterator<Token> i = tokens.iterator(); i.hasNext();) {
			token = i.next();
			returnToken = factory.createTokenVO();
			returnToken.setTokenPath(token.getFullName());
			returnToken.setNodeName(token.getNode().getName());
			comments = (comments) factory.createcomments();
			List<Comment> jComments = token.getComments();
			for (Iterator<Comment> iter = jComments.iterator(); iter.hasNext();) {
				jcomment = iter.next();
				comment = factory.createcomment();
				comment.setActorId(jcomment.getActorId());
				comment.setMessage(jcomment.getMessage());
				comment.setTime(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(jcomment.getTime()));
				comments.getComment().add(comment);
			}
			returnToken.setComments(comments);
			if (token.getEnd() != null)
				returnToken.setEnd(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(token.getEnd()));
			if (token.getStart() != null)
				returnToken.setStart(new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss z").format(token.getStart()));
			returnToken.setId(token.getId());
			
			statuses = factory.createtokenStatuses();
			statuses.setHasActiveChildren(token.hasActiveChildren());
			//statuses.setHasChild(token.hasChild());
			//statuses.setHasCode(token.hashCode());
			statuses.setHasEnded(token.hasEnded());
			statuses.setHasParent(token.hasParent());
			statuses.setIsAbleToReactivateParent(token.isAbleToReactivateParent());
			statuses.setIsLocked(token.isLocked());
			statuses.setIsRoot(token.isRoot());
			statuses.setIsSuspended(token.isSuspended());
			statuses.setIsTerminatedImplicit(token.isTerminationImplicit());
			statuses.setIsTerminatedmplicitly(token.isTerminatedImplicitly());
						
			returnToken.setTokenStatuses(statuses);
			
			returnToken.setType(getNodeType(processId, token.getNode().getName()));
			
			transitions = token.getAvailableTransitions();
	
			returnTransitions = factory.createtokenTransitions();
			for (Iterator<Transition> tokenIter = transitions.iterator(); tokenIter.hasNext();) {
				transition = tokenIter.next();
				returnTransition = factory.createtokenTransition();
				returnTransition.setFrom(transition.getFrom().getName());
				returnTransition.setTo(transition.getTo().getName());
				returnTransition.setName(transition.getName());
				returnTransitions.getTokenTransition().add(returnTransition);
			}
			returnToken.setTokenTransitions(returnTransitions);
			
			if ( filter.equals(ALL) ) {
				returnTokens.getToken().add(returnToken);
			}
			else if (filter.equals(SUSPENDED) && token.isSuspended()) {
				returnTokens.getToken().add(returnToken);
			}
			else if (filter.equals(ENDED)  && token.hasEnded()) {
				returnTokens.getToken().add(returnToken);
			}
			else if (filter.equals(OPEN) && !token.hasEnded()){
				returnTokens.getToken().add(returnToken);
			}
			
		}
		
		jbpmContext.close();
		return returnTokens;
	}
	
	public String getNodeType(long processId, String nodeName) {
		// It is necessary to open a new jbpmContext, or the nodetype will be returned as org.jbpm.graph.def.Node$$EnhancerByCGLIB$$916c19a
		// due to some processing by Hibernate.
		JbpmContext jbpmContext = jbpmContextHelper.getConfiguration().createJbpmContext();
		ProcessDefinition processDef = jbpmContext.getGraphSession().getProcessDefinition(processId);
		String rval = processDef.getNode(nodeName).getClass().getName();
		jbpmContext.close();
		return rval.substring(rval.lastIndexOf('.') + 1);
	}

}
