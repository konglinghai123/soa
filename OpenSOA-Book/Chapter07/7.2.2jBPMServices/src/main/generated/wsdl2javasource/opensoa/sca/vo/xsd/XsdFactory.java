/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.sca.vo.xsd;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;
import org.apache.tuscany.sdo.helper.TypeHelperImpl;

import commonj.sdo.DataObject;
import commonj.sdo.Property;
import commonj.sdo.Type;

import org.apache.tuscany.sdo.impl.FactoryBase;

import org.apache.tuscany.sdo.model.ModelFactory;

import org.apache.tuscany.sdo.model.impl.ModelFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * patternVersion=1.2; -prefix Xsd -noInterfaces
 * @generated
 */
public class XsdFactory extends FactoryBase
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XsdFactory INSTANCE = opensoa.sca.vo.xsd.XsdFactory.init();

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_URI = "http://vo.sca.opensoa/xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NAMESPACE_PREFIX = "jbpm";

	/**
	 * The version of the generator pattern used to generate this class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String PATTERN_VERSION = "1.2";
	
	public static final int ACTOR_TASKS_TYPE = 1;	
	public static final int ADDRESS_TYPE = 2;	
	public static final int APPLICANT_TYPE = 3;	
	public static final int COMMENT = 4;	
	public static final int COMMENTS = 5;	
	public static final int CONTACT_INFO_TYPE = 6;	
	public static final int CREATE_PROCESS_INSTANCE = 7;	
	public static final int CREATE_PROCESS_INSTANCE_RESPONSE = 8;	
	public static final int EMPLOYEE_DATA_TYPE = 9;	
	public static final int EMPLOYEE_TYPE = 10;	
	public static final int FLEX_TYPE = 11;	
	public static final int GET_OBJECT = 12;	
	public static final int GET_OBJECT_RESPONSE = 13;	
	public static final int IDS_TYPE = 14;	
	public static final int INDICATIVE_TYPE = 15;	
	public static final int LIST_ACTOR_TASKS = 16;	
	public static final int LIST_ACTOR_TASKS_RESPONSE = 17;	
	public static final int LIST_INSTANCE_TASKS = 18;	
	public static final int LIST_INSTANCE_TASKS_RESPONSE = 19;	
	public static final int LIST_INSTANCE_TOKENS = 20;	
	public static final int LIST_INSTANCE_TOKENS_RESPONSE = 21;	
	public static final int LIST_PROCESSES = 22;	
	public static final int LIST_PROCESSES_RESPONSE = 23;	
	public static final int LIST_PROCESS_INSTANCES = 24;	
	public static final int LIST_PROCESS_INSTANCES_RESPONSE = 25;	
	public static final int OBJECT_REQUEST_TYPE = 26;	
	public static final int OBJECT_RESPONSE_TYPE = 27;	
	public static final int PHONE = 28;	
	public static final int PHONES_TYPE = 29;	
	public static final int POOL_ACTORS = 30;	
	public static final int PROCESS = 31;	
	public static final int PROCESS_INSTANCE_VO = 32;	
	public static final int PROCESS_INSTANCE_VO_TYPE = 33;	
	public static final int PROCESS_TYPE = 34;	
	public static final int PROCESS_VARS_TYPE = 35;	
	public static final int PROCESS_VO = 36;	
	public static final int PROCESS_VO_TYPE = 37;	
	public static final int STATUSES = 38;	
	public static final int TASKS_TYPE = 39;	
	public static final int TASK_VO = 40;	
	public static final int TOKEN_STATUSES = 41;	
	public static final int TOKENS_TYPE = 42;	
	public static final int TOKEN_TRANSITION = 43;	
	public static final int TOKEN_TRANSITIONS = 44;	
	public static final int TOKEN_VO = 45;	
	public static final int TRANSITION = 46;	
	public static final int TRANSITIONS = 47;	
	public static final int UPDATE_TOKEN = 48;	
	public static final int UPDATE_TOKEN_REQUEST = 49;	
	public static final int UPDATE_TOKEN_RESPONSE = 50;	
	public static final int UPDATE_TOKEN_RESPONSE_TYPE = 51;	
	public static final int VALUE = 52;	
	public static final int VALUE1 = 53;	
	public static final int VAR = 54;	
	public static final int ACTION = 55;	
	public static final int FILTER = 56;	
	public static final int FILTER1 = 57;	
	public static final int FILTER2 = 58;	
	public static final int FILTER3 = 59;	
	public static final int OBJECT_CLASS_NAME = 60;
	
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdFactory()
	{
		super(NAMESPACE_URI, NAMESPACE_PREFIX, "opensoa.sca.vo.xsd");
	}

	/**
	 * Registers the Factory instance so that it is available within the supplied scope.
   * @argument scope a HelperContext instance that will make the types supported by this Factory available.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void register(HelperContext scope) 
	{
		if(scope == null) {
			throw new IllegalArgumentException("Scope can not be null");
		}

		if (((HelperContextImpl)scope).getExtendedMetaData().getPackage(NAMESPACE_URI) != null)
			return;
    
		// Register this package with provided scope   
		((HelperContextImpl)scope).getExtendedMetaData().putPackage(NAMESPACE_URI, this);
		
		//Register dependent packages with provided scope
		ModelFactory.INSTANCE.register(scope);
  }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject create(int typeNumber)
	{
		switch (typeNumber)
		{
			case ACTOR_TASKS_TYPE: return (DataObject)createActorTasksType();
			case ADDRESS_TYPE: return (DataObject)createAddressType();
			case APPLICANT_TYPE: return (DataObject)createApplicantType();
			case COMMENT: return (DataObject)createcomment();
			case COMMENTS: return (DataObject)createcomments();
			case CONTACT_INFO_TYPE: return (DataObject)createContactInfoType();
			case CREATE_PROCESS_INSTANCE: return (DataObject)createcreateProcessInstance();
			case CREATE_PROCESS_INSTANCE_RESPONSE: return (DataObject)createcreateProcessInstanceResponse();
			case EMPLOYEE_DATA_TYPE: return (DataObject)createEmployeeDataType();
			case EMPLOYEE_TYPE: return (DataObject)createEmployeeType();
			case FLEX_TYPE: return (DataObject)createFlexType();
			case GET_OBJECT: return (DataObject)creategetObject();
			case GET_OBJECT_RESPONSE: return (DataObject)creategetObjectResponse();
			case IDS_TYPE: return (DataObject)createidsType();
			case INDICATIVE_TYPE: return (DataObject)createIndicativeType();
			case LIST_ACTOR_TASKS: return (DataObject)createlistActorTasks();
			case LIST_ACTOR_TASKS_RESPONSE: return (DataObject)createlistActorTasksResponse();
			case LIST_INSTANCE_TASKS: return (DataObject)createlistInstanceTasks();
			case LIST_INSTANCE_TASKS_RESPONSE: return (DataObject)createlistInstanceTasksResponse();
			case LIST_INSTANCE_TOKENS: return (DataObject)createlistInstanceTokens();
			case LIST_INSTANCE_TOKENS_RESPONSE: return (DataObject)createlistInstanceTokensResponse();
			case LIST_PROCESSES: return (DataObject)createlistProcesses();
			case LIST_PROCESSES_RESPONSE: return (DataObject)createlistProcessesResponse();
			case LIST_PROCESS_INSTANCES: return (DataObject)createlistProcessInstances();
			case LIST_PROCESS_INSTANCES_RESPONSE: return (DataObject)createlistProcessInstancesResponse();
			case OBJECT_REQUEST_TYPE: return (DataObject)createObjectRequestType();
			case OBJECT_RESPONSE_TYPE: return (DataObject)createObjectResponseType();
			case PHONE: return (DataObject)createphone();
			case PHONES_TYPE: return (DataObject)createPhonesType();
			case POOL_ACTORS: return (DataObject)createpoolActors();
			case PROCESS: return (DataObject)createprocess();
			case PROCESS_INSTANCE_VO: return (DataObject)createProcessInstanceVO();
			case PROCESS_INSTANCE_VO_TYPE: return (DataObject)createProcessInstanceVOType();
			case PROCESS_TYPE: return (DataObject)createProcessType();
			case PROCESS_VARS_TYPE: return (DataObject)createProcessVarsType();
			case PROCESS_VO: return (DataObject)createProcessVO();
			case PROCESS_VO_TYPE: return (DataObject)createProcessVOType();
			case STATUSES: return (DataObject)createstatuses();
			case TASKS_TYPE: return (DataObject)createTasksType();
			case TASK_VO: return (DataObject)createTaskVO();
			case TOKEN_STATUSES: return (DataObject)createtokenStatuses();
			case TOKENS_TYPE: return (DataObject)createTokensType();
			case TOKEN_TRANSITION: return (DataObject)createtokenTransition();
			case TOKEN_TRANSITIONS: return (DataObject)createtokenTransitions();
			case TOKEN_VO: return (DataObject)createTokenVO();
			case TRANSITION: return (DataObject)createtransition();
			case TRANSITIONS: return (DataObject)createtransitions();
			case UPDATE_TOKEN: return (DataObject)createupdateToken();
			case UPDATE_TOKEN_REQUEST: return (DataObject)createUpdateTokenRequest();
			case UPDATE_TOKEN_RESPONSE: return (DataObject)createupdateTokenResponse();
			case UPDATE_TOKEN_RESPONSE_TYPE: return (DataObject)createUpdateTokenResponseType();
			case VALUE: return (DataObject)createvalue();
			case VALUE1: return (DataObject)createvalue1();
			case VAR: return (DataObject)createvar();
			default:
				return super.create(typeNumber);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(int typeNumber, String initialValue)
	{
		switch (typeNumber)
		{
			case ACTION:
				return createactionFromString(initialValue);
			case FILTER:
				return createFilterFromString(initialValue);
			case FILTER1:
				return createFilter1FromString(initialValue);
			case FILTER2:
				return createFilter2FromString(initialValue);
			case FILTER3:
				return createFilter3FromString(initialValue);
			case OBJECT_CLASS_NAME:
				return createobjectClassNameFromString(initialValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(int typeNumber, Object instanceValue)
	{
		switch (typeNumber)
		{
			case ACTION:
				return convertactionToString(instanceValue);
			case FILTER:
				return convertFilterToString(instanceValue);
			case FILTER1:
				return convertFilter1ToString(instanceValue);
			case FILTER2:
				return convertFilter2ToString(instanceValue);
			case FILTER3:
				return convertFilter3ToString(instanceValue);
			case OBJECT_CLASS_NAME:
				return convertobjectClassNameToString(instanceValue);
			default:
				throw new IllegalArgumentException("The type number '" + typeNumber + "' is not a valid datatype");
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorTasksType createActorTasksType()
	{
		ActorTasksType actorTasksType = new ActorTasksType();
		return actorTasksType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType()
	{
		AddressType addressType = new AddressType();
		return addressType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicantType createApplicantType()
	{
		ApplicantType applicantType = new ApplicantType();
		return applicantType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comment createcomment()
	{
		comment comment = new comment();
		return comment;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comments createcomments()
	{
		comments comments = new comments();
		return comments;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInfoType createContactInfoType()
	{
		ContactInfoType contactInfoType = new ContactInfoType();
		return contactInfoType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public createProcessInstance createcreateProcessInstance()
	{
		createProcessInstance createProcessInstance = new createProcessInstance();
		return createProcessInstance;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public createProcessInstanceResponse createcreateProcessInstanceResponse()
	{
		createProcessInstanceResponse createProcessInstanceResponse = new createProcessInstanceResponse();
		return createProcessInstanceResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDataType createEmployeeDataType()
	{
		EmployeeDataType employeeDataType = new EmployeeDataType();
		return employeeDataType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeType createEmployeeType()
	{
		EmployeeType employeeType = new EmployeeType();
		return employeeType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlexType createFlexType()
	{
		FlexType flexType = new FlexType();
		return flexType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public getObject creategetObject()
	{
		getObject getObject = new getObject();
		return getObject;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public getObjectResponse creategetObjectResponse()
	{
		getObjectResponse getObjectResponse = new getObjectResponse();
		return getObjectResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public idsType createidsType()
	{
		idsType idsType = new idsType();
		return idsType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicativeType createIndicativeType()
	{
		IndicativeType indicativeType = new IndicativeType();
		return indicativeType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listActorTasks createlistActorTasks()
	{
		listActorTasks listActorTasks = new listActorTasks();
		return listActorTasks;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listActorTasksResponse createlistActorTasksResponse()
	{
		listActorTasksResponse listActorTasksResponse = new listActorTasksResponse();
		return listActorTasksResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTasks createlistInstanceTasks()
	{
		listInstanceTasks listInstanceTasks = new listInstanceTasks();
		return listInstanceTasks;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTasksResponse createlistInstanceTasksResponse()
	{
		listInstanceTasksResponse listInstanceTasksResponse = new listInstanceTasksResponse();
		return listInstanceTasksResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTokens createlistInstanceTokens()
	{
		listInstanceTokens listInstanceTokens = new listInstanceTokens();
		return listInstanceTokens;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listInstanceTokensResponse createlistInstanceTokensResponse()
	{
		listInstanceTokensResponse listInstanceTokensResponse = new listInstanceTokensResponse();
		return listInstanceTokensResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcesses createlistProcesses()
	{
		listProcesses listProcesses = new listProcesses();
		return listProcesses;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcessesResponse createlistProcessesResponse()
	{
		listProcessesResponse listProcessesResponse = new listProcessesResponse();
		return listProcessesResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcessInstances createlistProcessInstances()
	{
		listProcessInstances listProcessInstances = new listProcessInstances();
		return listProcessInstances;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listProcessInstancesResponse createlistProcessInstancesResponse()
	{
		listProcessInstancesResponse listProcessInstancesResponse = new listProcessInstancesResponse();
		return listProcessInstancesResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRequestType createObjectRequestType()
	{
		ObjectRequestType objectRequestType = new ObjectRequestType();
		return objectRequestType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectResponseType createObjectResponseType()
	{
		ObjectResponseType objectResponseType = new ObjectResponseType();
		return objectResponseType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public phone createphone()
	{
		phone phone = new phone();
		return phone;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhonesType createPhonesType()
	{
		PhonesType phonesType = new PhonesType();
		return phonesType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public poolActors createpoolActors()
	{
		poolActors poolActors = new poolActors();
		return poolActors;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public process createprocess()
	{
		process process = new process();
		return process;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstanceVO createProcessInstanceVO()
	{
		ProcessInstanceVO processInstanceVO = new ProcessInstanceVO();
		return processInstanceVO;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstanceVOType createProcessInstanceVOType()
	{
		ProcessInstanceVOType processInstanceVOType = new ProcessInstanceVOType();
		return processInstanceVOType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessType()
	{
		ProcessType processType = new ProcessType();
		return processType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessVarsType createProcessVarsType()
	{
		ProcessVarsType processVarsType = new ProcessVarsType();
		return processVarsType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessVO createProcessVO()
	{
		ProcessVO processVO = new ProcessVO();
		return processVO;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessVOType createProcessVOType()
	{
		ProcessVOType processVOType = new ProcessVOType();
		return processVOType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public statuses createstatuses()
	{
		statuses statuses = new statuses();
		return statuses;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksType createTasksType()
	{
		TasksType tasksType = new TasksType();
		return tasksType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskVO createTaskVO()
	{
		TaskVO taskVO = new TaskVO();
		return taskVO;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tokenStatuses createtokenStatuses()
	{
		tokenStatuses tokenStatuses = new tokenStatuses();
		return tokenStatuses;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokensType createTokensType()
	{
		TokensType tokensType = new TokensType();
		return tokensType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tokenTransition createtokenTransition()
	{
		tokenTransition tokenTransition = new tokenTransition();
		return tokenTransition;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tokenTransitions createtokenTransitions()
	{
		tokenTransitions tokenTransitions = new tokenTransitions();
		return tokenTransitions;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVO createTokenVO()
	{
		TokenVO tokenVO = new TokenVO();
		return tokenVO;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transition createtransition()
	{
		transition transition = new transition();
		return transition;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public transitions createtransitions()
	{
		transitions transitions = new transitions();
		return transitions;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public updateToken createupdateToken()
	{
		updateToken updateToken = new updateToken();
		return updateToken;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTokenRequest createUpdateTokenRequest()
	{
		UpdateTokenRequest updateTokenRequest = new UpdateTokenRequest();
		return updateTokenRequest;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public updateTokenResponse createupdateTokenResponse()
	{
		updateTokenResponse updateTokenResponse = new updateTokenResponse();
		return updateTokenResponse;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTokenResponseType createUpdateTokenResponseType()
	{
		UpdateTokenResponseType updateTokenResponseType = new UpdateTokenResponseType();
		return updateTokenResponseType;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public value createvalue()
	{
		value value = new value();
		return value;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public value1 createvalue1()
	{
		value1 value1 = new value1();
		return value1;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public var createvar()
	{
		var var = new var();
		return var;
	}
	
	// Following creates and initializes SDO metadata for the supported types.		
	protected Type actorTasksTypeType = null;

	public Type getActorTasksType()
	{
		return actorTasksTypeType;
	}
		
	protected Type addressTypeType = null;

	public Type getAddressType()
	{
		return addressTypeType;
	}
		
	protected Type applicantTypeType = null;

	public Type getApplicantType()
	{
		return applicantTypeType;
	}
		
	protected Type commentType = null;

	public Type getcomment()
	{
		return commentType;
	}
		
	protected Type commentsType = null;

	public Type getcomments()
	{
		return commentsType;
	}
		
	protected Type contactInfoTypeType = null;

	public Type getContactInfoType()
	{
		return contactInfoTypeType;
	}
		
	protected Type createProcessInstanceType = null;

	public Type getcreateProcessInstance()
	{
		return createProcessInstanceType;
	}
		
	protected Type createProcessInstanceResponseType = null;

	public Type getcreateProcessInstanceResponse()
	{
		return createProcessInstanceResponseType;
	}
			
	protected Type employeeDataTypeType = null;

	public Type getEmployeeDataType()
	{
		return employeeDataTypeType;
	}
		
	protected Type employeeTypeType = null;

	public Type getEmployeeType()
	{
		return employeeTypeType;
	}
		
	protected Type flexTypeType = null;

	public Type getFlexType()
	{
		return flexTypeType;
	}
		
	protected Type getObjectType = null;

	public Type getgetObject()
	{
		return getObjectType;
	}
		
	protected Type getObjectResponseType = null;

	public Type getgetObjectResponse()
	{
		return getObjectResponseType;
	}
		
	protected Type idsTypeType = null;

	public Type getidsType()
	{
		return idsTypeType;
	}
		
	protected Type indicativeTypeType = null;

	public Type getIndicativeType()
	{
		return indicativeTypeType;
	}
		
	protected Type listActorTasksType = null;

	public Type getlistActorTasks()
	{
		return listActorTasksType;
	}
		
	protected Type listActorTasksResponseType = null;

	public Type getlistActorTasksResponse()
	{
		return listActorTasksResponseType;
	}
		
	protected Type listInstanceTasksType = null;

	public Type getlistInstanceTasks()
	{
		return listInstanceTasksType;
	}
		
	protected Type listInstanceTasksResponseType = null;

	public Type getlistInstanceTasksResponse()
	{
		return listInstanceTasksResponseType;
	}
		
	protected Type listInstanceTokensType = null;

	public Type getlistInstanceTokens()
	{
		return listInstanceTokensType;
	}
		
	protected Type listInstanceTokensResponseType = null;

	public Type getlistInstanceTokensResponse()
	{
		return listInstanceTokensResponseType;
	}
		
	protected Type listProcessesType = null;

	public Type getlistProcesses()
	{
		return listProcessesType;
	}
		
	protected Type listProcessesResponseType = null;

	public Type getlistProcessesResponse()
	{
		return listProcessesResponseType;
	}
		
	protected Type listProcessInstancesType = null;

	public Type getlistProcessInstances()
	{
		return listProcessInstancesType;
	}
		
	protected Type listProcessInstancesResponseType = null;

	public Type getlistProcessInstancesResponse()
	{
		return listProcessInstancesResponseType;
	}
		
	protected Type objectRequestTypeType = null;

	public Type getObjectRequestType()
	{
		return objectRequestTypeType;
	}
		
	protected Type objectResponseTypeType = null;

	public Type getObjectResponseType()
	{
		return objectResponseTypeType;
	}
		
	protected Type phoneType = null;

	public Type getphone()
	{
		return phoneType;
	}
		
	protected Type phonesTypeType = null;

	public Type getPhonesType()
	{
		return phonesTypeType;
	}
		
	protected Type poolActorsType = null;

	public Type getpoolActors()
	{
		return poolActorsType;
	}
		
	protected Type processType = null;

	public Type getprocess()
	{
		return processType;
	}
		
	protected Type processInstanceVOType = null;

	public Type getProcessInstanceVO()
	{
		return processInstanceVOType;
	}
		
	protected Type processInstanceVOTypeType = null;

	public Type getProcessInstanceVOType()
	{
		return processInstanceVOTypeType;
	}
		
	protected Type processTypeType = null;

	public Type getProcessType()
	{
		return processTypeType;
	}
		
	protected Type processVarsTypeType = null;

	public Type getProcessVarsType()
	{
		return processVarsTypeType;
	}
		
	protected Type processVOType = null;

	public Type getProcessVO()
	{
		return processVOType;
	}
		
	protected Type processVOTypeType = null;

	public Type getProcessVOType()
	{
		return processVOTypeType;
	}
		
	protected Type statusesType = null;

	public Type getstatuses()
	{
		return statusesType;
	}
		
	protected Type tasksTypeType = null;

	public Type getTasksType()
	{
		return tasksTypeType;
	}
		
	protected Type taskVOType = null;

	public Type getTaskVO()
	{
		return taskVOType;
	}
		
	protected Type tokenStatusesType = null;

	public Type gettokenStatuses()
	{
		return tokenStatusesType;
	}
		
	protected Type tokensTypeType = null;

	public Type getTokensType()
	{
		return tokensTypeType;
	}
		
	protected Type tokenTransitionType = null;

	public Type gettokenTransition()
	{
		return tokenTransitionType;
	}
		
	protected Type tokenTransitionsType = null;

	public Type gettokenTransitions()
	{
		return tokenTransitionsType;
	}
		
	protected Type tokenVOType = null;

	public Type getTokenVO()
	{
		return tokenVOType;
	}
		
	protected Type transitionType = null;

	public Type gettransition()
	{
		return transitionType;
	}
		
	protected Type transitionsType = null;

	public Type gettransitions()
	{
		return transitionsType;
	}
		
	protected Type updateTokenType = null;

	public Type getupdateToken()
	{
		return updateTokenType;
	}
		
	protected Type updateTokenRequestType = null;

	public Type getUpdateTokenRequest()
	{
		return updateTokenRequestType;
	}
		
	protected Type updateTokenResponseType = null;

	public Type getupdateTokenResponse()
	{
		return updateTokenResponseType;
	}
		
	protected Type updateTokenResponseTypeType = null;

	public Type getUpdateTokenResponseType()
	{
		return updateTokenResponseTypeType;
	}
		
	protected Type valueType = null;

	public Type getvalue()
	{
		return valueType;
	}
		
	protected Type value1Type = null;

	public Type getvalue1()
	{
		return value1Type;
	}
		
	protected Type varType = null;

	public Type getvar()
	{
		return varType;
	}
		
	protected Type actionType = null;

	public Type getaction()
	{
		return actionType;
	}
		
	protected Type filterType = null;

	public Type getFilter()
	{
		return filterType;
	}
		
	protected Type filter1Type = null;

	public Type getFilter1()
	{
		return filter1Type;
	}
		
	protected Type filter2Type = null;

	public Type getFilter2()
	{
		return filter2Type;
	}
		
	protected Type filter3Type = null;

	public Type getFilter3()
	{
		return filter3Type;
	}
		
	protected Type objectClassNameType = null;

	public Type getobjectClassName()
	{
		return objectClassNameType;
	}
	

	private static XsdFactory instance = null; 
	public static XsdFactory init()
	{
		if (instance != null ) return instance;
		instance = new XsdFactory();

		// Create package meta-data objects
		instance.createMetaData();

		// Initialize created meta-data
		instance.initializeMetaData();
		
		// Mark meta-data to indicate it can't be changed
		//theXsdFactory.freeze(); //FB do we need to freeze / should we freeze ????

		return instance;
	}
  
	private boolean isCreated = false;

	public void createMetaData()
	{
		if (isCreated) return;
		isCreated = true;	

		// Create types and their properties
		actorTasksTypeType = createType(false, ACTOR_TASKS_TYPE);
		createProperty(false, actorTasksTypeType,ActorTasksType._INTERNAL_POOLED); 
		createProperty(false, actorTasksTypeType,ActorTasksType._INTERNAL_ASSIGNED); 
		addressTypeType = createType(false, ADDRESS_TYPE);
		createProperty(true, addressTypeType,AddressType._INTERNAL_ADDRESSLINE1); 
		createProperty(true, addressTypeType,AddressType._INTERNAL_ADDRESSLINE2); 
		createProperty(true, addressTypeType,AddressType._INTERNAL_MUNICIPALITY); 
		createProperty(true, addressTypeType,AddressType._INTERNAL_REGION); 
		createProperty(true, addressTypeType,AddressType._INTERNAL_COUNTRY); 
		createProperty(true, addressTypeType,AddressType._INTERNAL_POSTAL_CODE); 
		applicantTypeType = createType(false, APPLICANT_TYPE);
		createProperty(false, applicantTypeType,ApplicantType._INTERNAL_INDICATIVE); 
		createProperty(false, applicantTypeType,ApplicantType._INTERNAL_CONTACT_INFO); 
		createProperty(true, applicantTypeType,ApplicantType._INTERNAL_OBJECT_ID); 
		commentType = createType(false, COMMENT);
		createProperty(true, commentType,comment._INTERNAL_ACTOR_ID); 
		createProperty(true, commentType,comment._INTERNAL_MESSAGE); 
		createProperty(true, commentType,comment._INTERNAL_TIME); 
		commentsType = createType(false, COMMENTS);
		createProperty(false, commentsType,comments._INTERNAL_COMMENT); 
		contactInfoTypeType = createType(false, CONTACT_INFO_TYPE);
		createProperty(true, contactInfoTypeType,ContactInfoType._INTERNAL_EMAIL_ADDRESS); 
		createProperty(false, contactInfoTypeType,ContactInfoType._INTERNAL_PHONES); 
		createProperty(false, contactInfoTypeType,ContactInfoType._INTERNAL_ADDRESS); 
		createProcessInstanceType = createType(false, CREATE_PROCESS_INSTANCE);
		createProperty(false, createProcessInstanceType,createProcessInstance._INTERNAL_PROCESS); 
		createProcessInstanceResponseType = createType(false, CREATE_PROCESS_INSTANCE_RESPONSE);
		createProperty(true, createProcessInstanceResponseType,createProcessInstanceResponse._INTERNAL_PROCESS_INSTANCE_ID); 
		employeeDataTypeType = createType(false, EMPLOYEE_DATA_TYPE);
		createProperty(true, employeeDataTypeType,EmployeeDataType._INTERNAL_EMPLOYEE_ID); 
		createProperty(true, employeeDataTypeType,EmployeeDataType._INTERNAL_TITLE); 
		createProperty(true, employeeDataTypeType,EmployeeDataType._INTERNAL_DEPARTMENT); 
		createProperty(true, employeeDataTypeType,EmployeeDataType._INTERNAL_LOCATION); 
		createProperty(false, employeeDataTypeType,EmployeeDataType._INTERNAL_FLEX); 
		employeeTypeType = createType(false, EMPLOYEE_TYPE);
		createProperty(false, employeeTypeType,EmployeeType._INTERNAL_INDICATIVE); 
		createProperty(false, employeeTypeType,EmployeeType._INTERNAL_CONTACT_INFO); 
		createProperty(false, employeeTypeType,EmployeeType._INTERNAL_EMPLOYEE_DATA); 
		createProperty(true, employeeTypeType,EmployeeType._INTERNAL_OBJECT_ID); 
		flexTypeType = createType(false, FLEX_TYPE);
		createProperty(false, flexTypeType,FlexType._INTERNAL_VALUE); 
		getObjectType = createType(false, GET_OBJECT);
		createProperty(false, getObjectType,getObject._INTERNAL_OBJECT); 
		getObjectResponseType = createType(false, GET_OBJECT_RESPONSE);
		createProperty(false, getObjectResponseType,getObjectResponse._INTERNAL_OBJECT); 
		idsTypeType = createType(false, IDS_TYPE);
		createProperty(false, idsTypeType,idsType._INTERNAL_VALUE); 
		indicativeTypeType = createType(false, INDICATIVE_TYPE);
		createProperty(true, indicativeTypeType,IndicativeType._INTERNAL_FAMILY_NAME); 
		createProperty(true, indicativeTypeType,IndicativeType._INTERNAL_GIVEN_NAME); 
		createProperty(true, indicativeTypeType,IndicativeType._INTERNAL_MIDDLE_NAME); 
		createProperty(true, indicativeTypeType,IndicativeType._INTERNAL_DOB); 
		createProperty(false, indicativeTypeType,IndicativeType._INTERNAL_IDS); 
		listActorTasksType = createType(false, LIST_ACTOR_TASKS);
		createProperty(true, listActorTasksType,listActorTasks._INTERNAL_ACTOR_ID); 
		createProperty(true, listActorTasksType,listActorTasks._INTERNAL_FILTER); 
		listActorTasksResponseType = createType(false, LIST_ACTOR_TASKS_RESPONSE);
		createProperty(false, listActorTasksResponseType,listActorTasksResponse._INTERNAL_TASKS); 
		listInstanceTasksType = createType(false, LIST_INSTANCE_TASKS);
		createProperty(true, listInstanceTasksType,listInstanceTasks._INTERNAL_PROCESS_INSTANCE_ID); 
		createProperty(true, listInstanceTasksType,listInstanceTasks._INTERNAL_FILTER); 
		listInstanceTasksResponseType = createType(false, LIST_INSTANCE_TASKS_RESPONSE);
		createProperty(false, listInstanceTasksResponseType,listInstanceTasksResponse._INTERNAL_TASKS); 
		listInstanceTokensType = createType(false, LIST_INSTANCE_TOKENS);
		createProperty(true, listInstanceTokensType,listInstanceTokens._INTERNAL_PROCESS_INSTANCE_ID); 
		createProperty(true, listInstanceTokensType,listInstanceTokens._INTERNAL_FILTER); 
		listInstanceTokensResponseType = createType(false, LIST_INSTANCE_TOKENS_RESPONSE);
		createProperty(false, listInstanceTokensResponseType,listInstanceTokensResponse._INTERNAL_TOKENS); 
		listProcessesType = createType(false, LIST_PROCESSES);
		listProcessesResponseType = createType(false, LIST_PROCESSES_RESPONSE);
		createProperty(false, listProcessesResponseType,listProcessesResponse._INTERNAL_PROCESSES); 
		listProcessInstancesType = createType(false, LIST_PROCESS_INSTANCES);
		createProperty(true, listProcessInstancesType,listProcessInstances._INTERNAL_PROCESS_ID); 
		createProperty(true, listProcessInstancesType,listProcessInstances._INTERNAL_FILTER); 
		listProcessInstancesResponseType = createType(false, LIST_PROCESS_INSTANCES_RESPONSE);
		createProperty(false, listProcessInstancesResponseType,listProcessInstancesResponse._INTERNAL_PROCESS_INSTANCES); 
		objectRequestTypeType = createType(false, OBJECT_REQUEST_TYPE);
		createProperty(true, objectRequestTypeType,ObjectRequestType._INTERNAL_OBJECT_ID); 
		createProperty(true, objectRequestTypeType,ObjectRequestType._INTERNAL_OBJECT_CLASS_NAME); 
		objectResponseTypeType = createType(false, OBJECT_RESPONSE_TYPE);
		createProperty(false, objectResponseTypeType,ObjectResponseType._INTERNAL_EMPLOYEE); 
		createProperty(false, objectResponseTypeType,ObjectResponseType._INTERNAL_APPLICANT); 
		phoneType = createType(false, PHONE);
		createProperty(true, phoneType,phone._INTERNAL_VALUE); 
		createProperty(true, phoneType,phone._INTERNAL_TYPE); 
		phonesTypeType = createType(false, PHONES_TYPE);
		createProperty(false, phonesTypeType,PhonesType._INTERNAL_PHONE); 
		poolActorsType = createType(false, POOL_ACTORS);
		createProperty(true, poolActorsType,poolActors._INTERNAL_ACTOR_ID); 
		processType = createType(false, PROCESS);
		createProperty(true, processType,process._INTERNAL_VALUE); 
		createProperty(true, processType,process._INTERNAL_NAME); 
		createProperty(true, processType,process._INTERNAL_INSTANCE_ID); 
		processInstanceVOType = createType(false, PROCESS_INSTANCE_VO);
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_START); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_END); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_ID); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_KEY); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_VERSION); 
		createProperty(false, processInstanceVOType,ProcessInstanceVO._INTERNAL_PROCESS_VARIABLES); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_IS_TERMINATED_IMPLICITLY); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_HAS_ENDED); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_IS_SUSPENDED); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_NAME); 
		createProperty(true, processInstanceVOType,ProcessInstanceVO._INTERNAL_VER); 
		processInstanceVOTypeType = createType(false, PROCESS_INSTANCE_VO_TYPE);
		createProperty(false, processInstanceVOTypeType,ProcessInstanceVOType._INTERNAL_INSTANCE); 
		processTypeType = createType(false, PROCESS_TYPE);
		createProperty(true, processTypeType,ProcessType._INTERNAL_KEY); 
		createProperty(false, processTypeType,ProcessType._INTERNAL_PROCESS_VARS); 
		createProperty(true, processTypeType,ProcessType._INTERNAL_ACTOR_ID); 
		createProperty(true, processTypeType,ProcessType._INTERNAL_PROCESS_NAME); 
		processVarsTypeType = createType(false, PROCESS_VARS_TYPE);
		createProperty(false, processVarsTypeType,ProcessVarsType._INTERNAL_VAR); 
		processVOType = createType(false, PROCESS_VO);
		createProperty(true, processVOType,ProcessVO._INTERNAL_DESCRIPTION); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_HAS_ACTIONS); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_HAS_EVENTS); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_ID); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_NAME); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_VERSION); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_RUNNING); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_SUSPENDED); 
		createProperty(true, processVOType,ProcessVO._INTERNAL_ENDED); 
		processVOTypeType = createType(false, PROCESS_VO_TYPE);
		createProperty(false, processVOTypeType,ProcessVOType._INTERNAL_PROCESS); 
		statusesType = createType(false, STATUSES);
		createProperty(true, statusesType,statuses._INTERNAL_IS_BLOCKING); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_CANCELLED); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_LAST); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_OPEN); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_SIGNALING); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_START_INSTANCE); 
		createProperty(true, statusesType,statuses._INTERNAL_IS_SUSPENDED); 
		createProperty(true, statusesType,statuses._INTERNAL_HAS_ENDED); 
		tasksTypeType = createType(false, TASKS_TYPE);
		createProperty(false, tasksTypeType,TasksType._INTERNAL_TASK); 
		taskVOType = createType(false, TASK_VO);
		createProperty(true, taskVOType,TaskVO._INTERNAL_NAME); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_DESCRIPTION); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_PROCESS); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_COMMENTS); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_CREATED); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_DUE_DATE); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_END); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_PRIORITY); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_START); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_ACTOR_ID); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_POOL_ACTORS); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_TRANSITIONS); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_STATUSES); 
		createProperty(false, taskVOType,TaskVO._INTERNAL_TOKEN_VARIABLES); 
		createProperty(true, taskVOType,TaskVO._INTERNAL_ID); 
		tokenStatusesType = createType(false, TOKEN_STATUSES);
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_SUSPENDED); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_ABLE_TO_REACTIVATE_PARENT); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_LOCKED); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_ROOT); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_TERMINATEDMPLICITLY); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_IS_TERMINATED_IMPLICIT); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_HAS_ACTIVE_CHILDREN); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_HAS_ENDED); 
		createProperty(true, tokenStatusesType,tokenStatuses._INTERNAL_HAS_PARENT); 
		tokensTypeType = createType(false, TOKENS_TYPE);
		createProperty(false, tokensTypeType,TokensType._INTERNAL_TOKEN); 
		tokenTransitionType = createType(false, TOKEN_TRANSITION);
		createProperty(true, tokenTransitionType,tokenTransition._INTERNAL_NAME); 
		createProperty(true, tokenTransitionType,tokenTransition._INTERNAL_FROM); 
		createProperty(true, tokenTransitionType,tokenTransition._INTERNAL_TO); 
		createProperty(true, tokenTransitionType,tokenTransition._INTERNAL_ID); 
		tokenTransitionsType = createType(false, TOKEN_TRANSITIONS);
		createProperty(false, tokenTransitionsType,tokenTransitions._INTERNAL_TOKEN_TRANSITION); 
		tokenVOType = createType(false, TOKEN_VO);
		createProperty(true, tokenVOType,TokenVO._INTERNAL_TOKEN_PATH); 
		createProperty(true, tokenVOType,TokenVO._INTERNAL_NODE_NAME); 
		createProperty(true, tokenVOType,TokenVO._INTERNAL_TYPE); 
		createProperty(false, tokenVOType,TokenVO._INTERNAL_COMMENTS); 
		createProperty(true, tokenVOType,TokenVO._INTERNAL_START); 
		createProperty(true, tokenVOType,TokenVO._INTERNAL_END); 
		createProperty(false, tokenVOType,TokenVO._INTERNAL_TOKEN_TRANSITIONS); 
		createProperty(false, tokenVOType,TokenVO._INTERNAL_TOKEN_STATUSES); 
		createProperty(true, tokenVOType,TokenVO._INTERNAL_ID); 
		transitionType = createType(false, TRANSITION);
		createProperty(true, transitionType,transition._INTERNAL_NAME); 
		createProperty(true, transitionType,transition._INTERNAL_CONDITION); 
		createProperty(true, transitionType,transition._INTERNAL_TO); 
		createProperty(true, transitionType,transition._INTERNAL_ID); 
		transitionsType = createType(false, TRANSITIONS);
		createProperty(false, transitionsType,transitions._INTERNAL_TRANSITION); 
		updateTokenType = createType(false, UPDATE_TOKEN);
		createProperty(false, updateTokenType,updateToken._INTERNAL_TOKEN); 
		updateTokenRequestType = createType(false, UPDATE_TOKEN_REQUEST);
		createProperty(true, updateTokenRequestType,UpdateTokenRequest._INTERNAL_PROCESS_ID); 
		createProperty(true, updateTokenRequestType,UpdateTokenRequest._INTERNAL_TOKEN_PATH); 
		createProperty(true, updateTokenRequestType,UpdateTokenRequest._INTERNAL_ACTION); 
		createProperty(true, updateTokenRequestType,UpdateTokenRequest._INTERNAL_TRANSITION_NAME); 
		createProperty(true, updateTokenRequestType,UpdateTokenRequest._INTERNAL_COMMENT); 
		createProperty(false, updateTokenRequestType,UpdateTokenRequest._INTERNAL_LOCAL_VARIABLES); 
		createProperty(false, updateTokenRequestType,UpdateTokenRequest._INTERNAL_PROCESS_VARIABLES); 
		updateTokenResponseType = createType(false, UPDATE_TOKEN_RESPONSE);
		createProperty(false, updateTokenResponseType,updateTokenResponse._INTERNAL_UPDATE_RESPONSE); 
		updateTokenResponseTypeType = createType(false, UPDATE_TOKEN_RESPONSE_TYPE);
		createProperty(true, updateTokenResponseTypeType,UpdateTokenResponseType._INTERNAL_SUCCESS); 
		valueType = createType(false, VALUE);
		createProperty(true, valueType,value._INTERNAL_VALUE); 
		createProperty(true, valueType,value._INTERNAL_NAME); 
		value1Type = createType(false, VALUE1);
		createProperty(true, value1Type,value1._INTERNAL_VALUE); 
		createProperty(true, value1Type,value1._INTERNAL_NAME); 
		createProperty(true, value1Type,value1._INTERNAL_ISSUED_BY); 
		varType = createType(false, VAR);
		createProperty(true, varType,var._INTERNAL_VALUE); 
		createProperty(true, varType,var._INTERNAL_NAME); 

		// Create data types
		actionType = createType(true, ACTION );
		filterType = createType(true, FILTER );
		filter1Type = createType(true, FILTER1 );
		filter2Type = createType(true, FILTER2 );
		filter3Type = createType(true, FILTER3 );
		objectClassNameType = createType(true, OBJECT_CLASS_NAME );
	}
	
	private boolean isInitialized = false;

	public void initializeMetaData()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Obtain other dependent packages
		ModelFactoryImpl theModelPackageImpl = (ModelFactoryImpl)ModelFactoryImpl.init();
		Property property = null;

		// Add supertypes to types

		// Initialize types and properties
		initializeType(actorTasksTypeType, ActorTasksType.class, "ActorTasksType", false);
		property = getLocalProperty(actorTasksTypeType, 0);
		initializeProperty(property, this.getTaskVO(), "Pooled", null, 0, -1, ActorTasksType.class, false, false, false, true , null);

		property = getLocalProperty(actorTasksTypeType, 1);
		initializeProperty(property, this.getTaskVO(), "Assigned", null, 0, -1, ActorTasksType.class, false, false, false, true , null);

		initializeType(addressTypeType, AddressType.class, "AddressType", false);
		property = getLocalProperty(addressTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "addressline1", null, 1, 1, AddressType.class, false, true, false);

		property = getLocalProperty(addressTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "addressline2", null, 0, 1, AddressType.class, false, true, false);

		property = getLocalProperty(addressTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "municipality", null, 1, 1, AddressType.class, false, true, false);

		property = getLocalProperty(addressTypeType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "region", null, 1, 1, AddressType.class, false, true, false);

		property = getLocalProperty(addressTypeType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "country", null, 1, 1, AddressType.class, false, true, false);

		property = getLocalProperty(addressTypeType, 5);
		initializeProperty(property, theModelPackageImpl.getString(), "postalCode", null, 1, 1, AddressType.class, false, true, false);

		initializeType(applicantTypeType, ApplicantType.class, "ApplicantType", false);
		property = getLocalProperty(applicantTypeType, 0);
		initializeProperty(property, this.getIndicativeType(), "indicative", null, 1, 1, ApplicantType.class, false, true, false, true , null);

		property = getLocalProperty(applicantTypeType, 1);
		initializeProperty(property, this.getContactInfoType(), "contactInfo", null, 1, 1, ApplicantType.class, false, true, false, true , null);

		property = getLocalProperty(applicantTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "objectId", null, 1, 1, ApplicantType.class, false, true, false);

		initializeType(commentType, comment.class, "comment", false);
		property = getLocalProperty(commentType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "actorId", null, 1, 1, comment.class, false, true, false);

		property = getLocalProperty(commentType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "message", null, 1, 1, comment.class, false, true, false);

		property = getLocalProperty(commentType, 2);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "time", null, 1, 1, comment.class, false, true, false);

		initializeType(commentsType, comments.class, "comments", false);
		property = getLocalProperty(commentsType, 0);
		initializeProperty(property, this.getcomment(), "comment", null, 1, -1, comments.class, false, false, false, true , null);

		initializeType(contactInfoTypeType, ContactInfoType.class, "ContactInfoType", false);
		property = getLocalProperty(contactInfoTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "emailAddress", null, 0, 1, ContactInfoType.class, false, true, false);

		property = getLocalProperty(contactInfoTypeType, 1);
		initializeProperty(property, this.getPhonesType(), "phones", null, 0, 1, ContactInfoType.class, false, true, false, true , null);

		property = getLocalProperty(contactInfoTypeType, 2);
		initializeProperty(property, this.getAddressType(), "address", null, 0, 1, ContactInfoType.class, false, true, false, true , null);

		initializeType(createProcessInstanceType, createProcessInstance.class, "createProcessInstance", false);
		property = getLocalProperty(createProcessInstanceType, 0);
		initializeProperty(property, this.getProcessType(), "Process", null, 1, 1, createProcessInstance.class, false, true, false, true , null);

		initializeType(createProcessInstanceResponseType, createProcessInstanceResponse.class, "createProcessInstanceResponse", false);
		property = getLocalProperty(createProcessInstanceResponseType, 0);
		initializeProperty(property, theModelPackageImpl.getLong(), "processInstanceId", null, 1, 1, createProcessInstanceResponse.class, false, true, false);

		initializeType(employeeDataTypeType, EmployeeDataType.class, "EmployeeDataType", false);
		property = getLocalProperty(employeeDataTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "employeeId", null, 1, 1, EmployeeDataType.class, false, true, false);

		property = getLocalProperty(employeeDataTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "title", null, 1, 1, EmployeeDataType.class, false, true, false);

		property = getLocalProperty(employeeDataTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "department", null, 1, 1, EmployeeDataType.class, false, true, false);

		property = getLocalProperty(employeeDataTypeType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "location", null, 1, 1, EmployeeDataType.class, false, true, false);

		property = getLocalProperty(employeeDataTypeType, 4);
		initializeProperty(property, this.getFlexType(), "flex", null, 0, 1, EmployeeDataType.class, false, true, false, true , null);

		initializeType(employeeTypeType, EmployeeType.class, "EmployeeType", false);
		property = getLocalProperty(employeeTypeType, 0);
		initializeProperty(property, this.getIndicativeType(), "indicative", null, 1, 1, EmployeeType.class, false, true, false, true , null);

		property = getLocalProperty(employeeTypeType, 1);
		initializeProperty(property, this.getContactInfoType(), "contactInfo", null, 1, 1, EmployeeType.class, false, true, false, true , null);

		property = getLocalProperty(employeeTypeType, 2);
		initializeProperty(property, this.getEmployeeDataType(), "employeeData", null, 1, 1, EmployeeType.class, false, true, false, true , null);

		property = getLocalProperty(employeeTypeType, 3);
		initializeProperty(property, theModelPackageImpl.getLong(), "objectId", null, 1, 1, EmployeeType.class, false, true, false);

		initializeType(flexTypeType, FlexType.class, "FlexType", false);
		property = getLocalProperty(flexTypeType, 0);
		initializeProperty(property, this.getvalue(), "value", null, 1, -1, FlexType.class, false, false, false, true , null);

		initializeType(getObjectType, getObject.class, "getObject", false);
		property = getLocalProperty(getObjectType, 0);
		initializeProperty(property, this.getObjectRequestType(), "Object", null, 1, 1, getObject.class, false, true, false, true , null);

		initializeType(getObjectResponseType, getObjectResponse.class, "getObjectResponse", false);
		property = getLocalProperty(getObjectResponseType, 0);
		initializeProperty(property, this.getObjectResponseType(), "Object", null, 1, 1, getObjectResponse.class, false, true, false, true , null);

		initializeType(idsTypeType, idsType.class, "idsType", false);
		property = getLocalProperty(idsTypeType, 0);
		initializeProperty(property, this.getvalue1(), "value", null, 1, -1, idsType.class, false, false, false, true , null);

		initializeType(indicativeTypeType, IndicativeType.class, "IndicativeType", false);
		property = getLocalProperty(indicativeTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "familyName", null, 1, 1, IndicativeType.class, false, true, false);

		property = getLocalProperty(indicativeTypeType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "givenName", null, 1, 1, IndicativeType.class, false, true, false);

		property = getLocalProperty(indicativeTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "middleName", null, 0, 1, IndicativeType.class, false, true, false);

		property = getLocalProperty(indicativeTypeType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "dob", null, 1, 1, IndicativeType.class, false, true, false);

		property = getLocalProperty(indicativeTypeType, 4);
		initializeProperty(property, this.getidsType(), "ids", null, 0, 1, IndicativeType.class, false, true, false, true , null);

		initializeType(listActorTasksType, listActorTasks.class, "listActorTasks", false);
		property = getLocalProperty(listActorTasksType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "actorId", null, 1, 1, listActorTasks.class, false, true, false);

		property = getLocalProperty(listActorTasksType, 1);
		initializeProperty(property, this.getFilter3(), "Filter", null, 1, 1, listActorTasks.class, false, true, false);

		initializeType(listActorTasksResponseType, listActorTasksResponse.class, "listActorTasksResponse", false);
		property = getLocalProperty(listActorTasksResponseType, 0);
		initializeProperty(property, this.getActorTasksType(), "Tasks", null, 0, 1, listActorTasksResponse.class, false, true, false, true , null);

		initializeType(listInstanceTasksType, listInstanceTasks.class, "listInstanceTasks", false);
		property = getLocalProperty(listInstanceTasksType, 0);
		initializeProperty(property, theModelPackageImpl.getLongObject(), "ProcessInstanceId", null, 1, 1, listInstanceTasks.class, false, true, false);

		property = getLocalProperty(listInstanceTasksType, 1);
		initializeProperty(property, this.getFilter2(), "Filter", null, 1, 1, listInstanceTasks.class, false, true, false);

		initializeType(listInstanceTasksResponseType, listInstanceTasksResponse.class, "listInstanceTasksResponse", false);
		property = getLocalProperty(listInstanceTasksResponseType, 0);
		initializeProperty(property, this.getTasksType(), "Tasks", null, 0, 1, listInstanceTasksResponse.class, false, true, false, true , null);

		initializeType(listInstanceTokensType, listInstanceTokens.class, "listInstanceTokens", false);
		property = getLocalProperty(listInstanceTokensType, 0);
		initializeProperty(property, theModelPackageImpl.getLongObject(), "ProcessInstanceId", null, 1, 1, listInstanceTokens.class, false, true, false);

		property = getLocalProperty(listInstanceTokensType, 1);
		initializeProperty(property, this.getFilter(), "Filter", null, 1, 1, listInstanceTokens.class, false, true, false);

		initializeType(listInstanceTokensResponseType, listInstanceTokensResponse.class, "listInstanceTokensResponse", false);
		property = getLocalProperty(listInstanceTokensResponseType, 0);
		initializeProperty(property, this.getTokensType(), "Tokens", null, 0, 1, listInstanceTokensResponse.class, false, true, false, true , null);

		initializeType(listProcessesType, listProcesses.class, "listProcesses", false);
		initializeType(listProcessesResponseType, listProcessesResponse.class, "listProcessesResponse", false);
		property = getLocalProperty(listProcessesResponseType, 0);
		initializeProperty(property, this.getProcessVOType(), "Processes", null, 0, 1, listProcessesResponse.class, false, true, false, true , null);

		initializeType(listProcessInstancesType, listProcessInstances.class, "listProcessInstances", false);
		property = getLocalProperty(listProcessInstancesType, 0);
		initializeProperty(property, theModelPackageImpl.getLongObject(), "ProcessId", null, 0, 1, listProcessInstances.class, false, true, false);

		property = getLocalProperty(listProcessInstancesType, 1);
		initializeProperty(property, this.getFilter1(), "Filter", null, 1, 1, listProcessInstances.class, false, true, false);

		initializeType(listProcessInstancesResponseType, listProcessInstancesResponse.class, "listProcessInstancesResponse", false);
		property = getLocalProperty(listProcessInstancesResponseType, 0);
		initializeProperty(property, this.getProcessInstanceVOType(), "ProcessInstances", null, 1, 1, listProcessInstancesResponse.class, false, true, false, true , null);

		initializeType(objectRequestTypeType, ObjectRequestType.class, "ObjectRequestType", false);
		property = getLocalProperty(objectRequestTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "objectId", null, 1, 1, ObjectRequestType.class, false, true, false);

		property = getLocalProperty(objectRequestTypeType, 1);
		initializeProperty(property, this.getobjectClassName(), "objectClassName", null, 1, 1, ObjectRequestType.class, false, true, false);

		initializeType(objectResponseTypeType, ObjectResponseType.class, "ObjectResponseType", false);
		property = getLocalProperty(objectResponseTypeType, 0);
		initializeProperty(property, this.getEmployeeType(), "Employee", null, 0, 1, ObjectResponseType.class, false, true, false, true , null);

		property = getLocalProperty(objectResponseTypeType, 1);
		initializeProperty(property, this.getApplicantType(), "Applicant", null, 0, 1, ObjectResponseType.class, false, true, false, true , null);

		initializeType(phoneType, phone.class, "phone", false);
		property = getLocalProperty(phoneType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "value", null, 0, 1, phone.class, false, true, false);

		property = getLocalProperty(phoneType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "type", null, 0, 1, phone.class, false, true, false);

		initializeType(phonesTypeType, PhonesType.class, "PhonesType", false);
		property = getLocalProperty(phonesTypeType, 0);
		initializeProperty(property, this.getphone(), "phone", null, 1, -1, PhonesType.class, false, false, false, true , null);

		initializeType(poolActorsType, poolActors.class, "poolActors", false);
		property = getLocalProperty(poolActorsType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "actorId", null, 0, -1, poolActors.class, false, false, false);

		initializeType(processType, process.class, "process", false);
		property = getLocalProperty(processType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "value", null, 0, 1, process.class, false, true, false);

		property = getLocalProperty(processType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 0, 1, process.class, false, true, false);

		property = getLocalProperty(processType, 2);
		initializeProperty(property, theModelPackageImpl.getLong(), "instanceId", null, 0, 1, process.class, false, true, false);

		initializeType(processInstanceVOType, ProcessInstanceVO.class, "ProcessInstanceVO", false);
		property = getLocalProperty(processInstanceVOType, 0);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "start", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 1);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "end", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 2);
		initializeProperty(property, theModelPackageImpl.getLong(), "id", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "key", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 4);
		initializeProperty(property, theModelPackageImpl.getInt(), "version", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 5);
		initializeProperty(property, this.getProcessVarsType(), "processVariables", null, 0, 1, ProcessInstanceVO.class, false, true, false, true , null);

		property = getLocalProperty(processInstanceVOType, 6);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isTerminatedImplicitly", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 7);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasEnded", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 8);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isSuspended", null, 0, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 9);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, ProcessInstanceVO.class, false, true, false);

		property = getLocalProperty(processInstanceVOType, 10);
		initializeProperty(property, theModelPackageImpl.getInt(), "ver", null, 1, 1, ProcessInstanceVO.class, false, true, false);

		initializeType(processInstanceVOTypeType, ProcessInstanceVOType.class, "ProcessInstanceVOType", false);
		property = getLocalProperty(processInstanceVOTypeType, 0);
		initializeProperty(property, this.getProcessInstanceVO(), "Instance", null, 0, 999, ProcessInstanceVOType.class, false, false, false, true , null);

		initializeType(processTypeType, ProcessType.class, "ProcessType", false);
		property = getLocalProperty(processTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "key", null, 0, 1, ProcessType.class, false, true, false);

		property = getLocalProperty(processTypeType, 1);
		initializeProperty(property, this.getProcessVarsType(), "ProcessVars", null, 0, 1, ProcessType.class, false, true, false, true , null);

		property = getLocalProperty(processTypeType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "actorId", null, 0, 1, ProcessType.class, false, true, false);

		property = getLocalProperty(processTypeType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "processName", null, 1, 1, ProcessType.class, false, true, false);

		initializeType(processVarsTypeType, ProcessVarsType.class, "ProcessVarsType", false);
		property = getLocalProperty(processVarsTypeType, 0);
		initializeProperty(property, this.getvar(), "var", null, 0, -1, ProcessVarsType.class, false, false, false, true , null);

		initializeType(processVOType, ProcessVO.class, "ProcessVO", false);
		property = getLocalProperty(processVOType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "description", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 1);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasActions", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 2);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasEvents", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 3);
		initializeProperty(property, theModelPackageImpl.getLong(), "id", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 5);
		initializeProperty(property, theModelPackageImpl.getInt(), "version", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 6);
		initializeProperty(property, theModelPackageImpl.getInt(), "running", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 7);
		initializeProperty(property, theModelPackageImpl.getInt(), "suspended", null, 0, 1, ProcessVO.class, false, true, false);

		property = getLocalProperty(processVOType, 8);
		initializeProperty(property, theModelPackageImpl.getInt(), "ended", null, 0, 1, ProcessVO.class, false, true, false);

		initializeType(processVOTypeType, ProcessVOType.class, "ProcessVOType", false);
		property = getLocalProperty(processVOTypeType, 0);
		initializeProperty(property, this.getProcessVO(), "Process", null, 0, 999, ProcessVOType.class, false, false, false, true , null);

		initializeType(statusesType, statuses.class, "statuses", false);
		property = getLocalProperty(statusesType, 0);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isBlocking", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 1);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isCancelled", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 2);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isLast", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 3);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isOpen", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 4);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isSignaling", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 5);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isStartInstance", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 6);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isSuspended", null, 1, 1, statuses.class, false, true, false);

		property = getLocalProperty(statusesType, 7);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasEnded", null, 1, 1, statuses.class, false, true, false);

		initializeType(tasksTypeType, TasksType.class, "TasksType", false);
		property = getLocalProperty(tasksTypeType, 0);
		initializeProperty(property, this.getTaskVO(), "Task", null, 0, -1, TasksType.class, false, false, false, true , null);

		initializeType(taskVOType, TaskVO.class, "TaskVO", false);
		property = getLocalProperty(taskVOType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "description", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 2);
		initializeProperty(property, this.getprocess(), "process", null, 0, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 3);
		initializeProperty(property, this.getcomments(), "comments", null, 1, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 4);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "created", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 5);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "dueDate", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 6);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "end", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 7);
		initializeProperty(property, theModelPackageImpl.getInt(), "priority", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 8);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "start", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 9);
		initializeProperty(property, theModelPackageImpl.getString(), "actorId", null, 1, 1, TaskVO.class, false, true, false);

		property = getLocalProperty(taskVOType, 10);
		initializeProperty(property, this.getpoolActors(), "poolActors", null, 1, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 11);
		initializeProperty(property, this.gettransitions(), "transitions", null, 1, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 12);
		initializeProperty(property, this.getstatuses(), "statuses", null, 1, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 13);
		initializeProperty(property, this.getProcessVarsType(), "tokenVariables", null, 0, 1, TaskVO.class, false, true, false, true , null);

		property = getLocalProperty(taskVOType, 14);
		initializeProperty(property, theModelPackageImpl.getLong(), "id", null, 0, 1, TaskVO.class, false, true, false);

		initializeType(tokenStatusesType, tokenStatuses.class, "tokenStatuses", false);
		property = getLocalProperty(tokenStatusesType, 0);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isSuspended", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 1);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isAbleToReactivateParent", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 2);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isLocked", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 3);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isRoot", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 4);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isTerminatedmplicitly", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 5);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "isTerminatedImplicit", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 6);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasActiveChildren", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 7);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasEnded", null, 1, 1, tokenStatuses.class, false, true, false);

		property = getLocalProperty(tokenStatusesType, 8);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "hasParent", null, 1, 1, tokenStatuses.class, false, true, false);

		initializeType(tokensTypeType, TokensType.class, "TokensType", false);
		property = getLocalProperty(tokensTypeType, 0);
		initializeProperty(property, this.getTokenVO(), "Token", null, 0, -1, TokensType.class, false, false, false, true , null);

		initializeType(tokenTransitionType, tokenTransition.class, "tokenTransition", false);
		property = getLocalProperty(tokenTransitionType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, tokenTransition.class, false, true, false);

		property = getLocalProperty(tokenTransitionType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "from", null, 1, 1, tokenTransition.class, false, true, false);

		property = getLocalProperty(tokenTransitionType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "to", null, 1, 1, tokenTransition.class, false, true, false);

		property = getLocalProperty(tokenTransitionType, 3);
		initializeProperty(property, theModelPackageImpl.getInt(), "id", null, 0, 1, tokenTransition.class, false, true, false);

		initializeType(tokenTransitionsType, tokenTransitions.class, "tokenTransitions", false);
		property = getLocalProperty(tokenTransitionsType, 0);
		initializeProperty(property, this.gettokenTransition(), "tokenTransition", null, 1, -1, tokenTransitions.class, false, false, false, true , null);

		initializeType(tokenVOType, TokenVO.class, "TokenVO", false);
		property = getLocalProperty(tokenVOType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "tokenPath", null, 1, 1, TokenVO.class, false, true, false);

		property = getLocalProperty(tokenVOType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "nodeName", null, 1, 1, TokenVO.class, false, true, false);

		property = getLocalProperty(tokenVOType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "type", null, 1, 1, TokenVO.class, false, true, false);

		property = getLocalProperty(tokenVOType, 3);
		initializeProperty(property, this.getcomments(), "comments", null, 1, 1, TokenVO.class, false, true, false, true , null);

		property = getLocalProperty(tokenVOType, 4);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "start", null, 1, 1, TokenVO.class, false, true, false);

		property = getLocalProperty(tokenVOType, 5);
		initializeProperty(property, theModelPackageImpl.getYearMonthDay(), "end", null, 1, 1, TokenVO.class, false, true, false);

		property = getLocalProperty(tokenVOType, 6);
		initializeProperty(property, this.gettokenTransitions(), "tokenTransitions", null, 1, 1, TokenVO.class, false, true, false, true , null);

		property = getLocalProperty(tokenVOType, 7);
		initializeProperty(property, this.gettokenStatuses(), "tokenStatuses", null, 1, 1, TokenVO.class, false, true, false, true , null);

		property = getLocalProperty(tokenVOType, 8);
		initializeProperty(property, theModelPackageImpl.getLong(), "id", null, 0, 1, TokenVO.class, false, true, false);

		initializeType(transitionType, transition.class, "transition", false);
		property = getLocalProperty(transitionType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 1, 1, transition.class, false, true, false);

		property = getLocalProperty(transitionType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "condition", null, 1, 1, transition.class, false, true, false);

		property = getLocalProperty(transitionType, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "to", null, 1, 1, transition.class, false, true, false);

		property = getLocalProperty(transitionType, 3);
		initializeProperty(property, theModelPackageImpl.getInt(), "id", null, 0, 1, transition.class, false, true, false);

		initializeType(transitionsType, transitions.class, "transitions", false);
		property = getLocalProperty(transitionsType, 0);
		initializeProperty(property, this.gettransition(), "transition", null, 1, -1, transitions.class, false, false, false, true , null);

		initializeType(updateTokenType, updateToken.class, "updateToken", false);
		property = getLocalProperty(updateTokenType, 0);
		initializeProperty(property, this.getUpdateTokenRequest(), "token", null, 1, 1, updateToken.class, false, true, false, true , null);

		initializeType(updateTokenRequestType, UpdateTokenRequest.class, "UpdateTokenRequest", false);
		property = getLocalProperty(updateTokenRequestType, 0);
		initializeProperty(property, theModelPackageImpl.getLong(), "processId", null, 1, 1, UpdateTokenRequest.class, false, true, false);

		property = getLocalProperty(updateTokenRequestType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "tokenPath", null, 1, 1, UpdateTokenRequest.class, false, true, false);

		property = getLocalProperty(updateTokenRequestType, 2);
		initializeProperty(property, this.getaction(), "action", null, 1, 1, UpdateTokenRequest.class, false, true, false);

		property = getLocalProperty(updateTokenRequestType, 3);
		initializeProperty(property, theModelPackageImpl.getString(), "transitionName", null, 0, 1, UpdateTokenRequest.class, false, true, false);

		property = getLocalProperty(updateTokenRequestType, 4);
		initializeProperty(property, theModelPackageImpl.getString(), "comment", null, 0, 1, UpdateTokenRequest.class, false, true, false);

		property = getLocalProperty(updateTokenRequestType, 5);
		initializeProperty(property, this.getProcessVarsType(), "localVariables", null, 0, 1, UpdateTokenRequest.class, false, true, false, true , null);

		property = getLocalProperty(updateTokenRequestType, 6);
		initializeProperty(property, this.getProcessVarsType(), "processVariables", null, 0, 1, UpdateTokenRequest.class, false, true, false, true , null);

		initializeType(updateTokenResponseType, updateTokenResponse.class, "updateTokenResponse", false);
		property = getLocalProperty(updateTokenResponseType, 0);
		initializeProperty(property, this.getUpdateTokenResponseType(), "updateResponse", null, 1, 1, updateTokenResponse.class, false, true, false, true , null);

		initializeType(updateTokenResponseTypeType, UpdateTokenResponseType.class, "UpdateTokenResponseType", false);
		property = getLocalProperty(updateTokenResponseTypeType, 0);
		initializeProperty(property, theModelPackageImpl.getBoolean(), "success", null, 1, 1, UpdateTokenResponseType.class, false, true, false);

		initializeType(valueType, value.class, "value", false);
		property = getLocalProperty(valueType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "value", null, 0, 1, value.class, false, true, false);

		property = getLocalProperty(valueType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 0, 1, value.class, false, true, false);

		initializeType(value1Type, value1.class, "value1", false);
		property = getLocalProperty(value1Type, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "value", null, 0, 1, value1.class, false, true, false);

		property = getLocalProperty(value1Type, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 0, 1, value1.class, false, true, false);

		property = getLocalProperty(value1Type, 2);
		initializeProperty(property, theModelPackageImpl.getString(), "issuedBy", null, 0, 1, value1.class, false, true, false);

		initializeType(varType, var.class, "var", false);
		property = getLocalProperty(varType, 0);
		initializeProperty(property, theModelPackageImpl.getString(), "value", null, 0, 1, var.class, false, true, false);

		property = getLocalProperty(varType, 1);
		initializeProperty(property, theModelPackageImpl.getString(), "name", null, 0, 1, var.class, false, true, false);

		// Initialize data types
		initializeType(actionType, String.class, "action", true, false);

		initializeType(filterType, String.class, "Filter", true, false);

		initializeType(filter1Type, String.class, "Filter1", true, false);

		initializeType(filter2Type, String.class, "Filter2", true, false);

		initializeType(filter3Type, String.class, "Filter3", true, false);

		initializeType(objectClassNameType, String.class, "objectClassName", true, false);

		createXSDMetaData(theModelPackageImpl);
	}
	  
	protected void createXSDMetaData(ModelFactoryImpl theModelPackageImpl)
	{
		super.initXSD();
		
		Property property = null;
		

		addXSDMapping
		  (actorTasksTypeType,
			 new String[] 
			 {
			 "name", "ActorTasksType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(actorTasksTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Pooled",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(actorTasksTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Assigned",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (addressTypeType,
			 new String[] 
			 {
			 "name", "AddressType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "addressline1",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "addressline2",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "municipality",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "region",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "country",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(addressTypeType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "postalCode",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (applicantTypeType,
			 new String[] 
			 {
			 "name", "ApplicantType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(applicantTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "indicative",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(applicantTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "contactInfo",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(applicantTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "objectId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (commentType,
			 new String[] 
			 {
			 "name", "comment_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(commentType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "actorId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(commentType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "message",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(commentType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (commentsType,
			 new String[] 
			 {
			 "name", "comments_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(commentsType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comment",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (contactInfoTypeType,
			 new String[] 
			 {
			 "name", "ContactInfoType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(contactInfoTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "emailAddress",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(contactInfoTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "phones",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(contactInfoTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (createProcessInstanceType,
			 new String[] 
			 {
			 "name", "createProcessInstance_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(createProcessInstanceType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Process",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (createProcessInstanceResponseType,
			 new String[] 
			 {
			 "name", "createProcessInstanceResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(createProcessInstanceResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "processInstanceId",
			 "namespace", "##targetNamespace"
			 });

		property = createGlobalProperty
		  ("comments",
		  this.getcomments(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comments",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("createProcessInstance",
		  this.getcreateProcessInstance(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "createProcessInstance",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("createProcessInstanceResponse",
		  this.getcreateProcessInstanceResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "createProcessInstanceResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("getObject",
		  this.getgetObject(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "getObject",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("getObjectResponse",
		  this.getgetObjectResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "getObjectResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listActorTasks",
		  this.getlistActorTasks(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listActorTasks",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listActorTasksResponse",
		  this.getlistActorTasksResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listActorTasksResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listInstanceTasks",
		  this.getlistInstanceTasks(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listInstanceTasks",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listInstanceTasksResponse",
		  this.getlistInstanceTasksResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listInstanceTasksResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listInstanceTokens",
		  this.getlistInstanceTokens(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listInstanceTokens",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listInstanceTokensResponse",
		  this.getlistInstanceTokensResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listInstanceTokensResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listProcesses",
		  this.getlistProcesses(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listProcesses",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listProcessesResponse",
		  this.getlistProcessesResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listProcessesResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listProcessInstances",
		  this.getlistProcessInstances(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listProcessInstances",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("listProcessInstancesResponse",
		  this.getlistProcessInstancesResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "listProcessInstancesResponse",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("updateToken",
		  this.getupdateToken(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "updateToken",
			 "namespace", "##targetNamespace"
			 });
                
		property = createGlobalProperty
		  ("updateTokenResponse",
		  this.getupdateTokenResponse(),
			 new String[]
			 {
			 "kind", "element",
			 "name", "updateTokenResponse",
			 "namespace", "##targetNamespace"
			 });
                
		addXSDMapping
		  (employeeDataTypeType,
			 new String[] 
			 {
			 "name", "EmployeeDataType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(employeeDataTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "employeeId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeDataTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeDataTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "department",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeDataTypeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeDataTypeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "flex",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (employeeTypeType,
			 new String[] 
			 {
			 "name", "EmployeeType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(employeeTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "indicative",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "contactInfo",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "employeeData",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(employeeTypeType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "objectId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (flexTypeType,
			 new String[] 
			 {
			 "name", "FlexType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(flexTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (getObjectType,
			 new String[] 
			 {
			 "name", "getObject_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(getObjectType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (getObjectResponseType,
			 new String[] 
			 {
			 "name", "getObjectResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(getObjectResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (idsTypeType,
			 new String[] 
			 {
			 "name", "idsType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(idsTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (indicativeTypeType,
			 new String[] 
			 {
			 "name", "IndicativeType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(indicativeTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "familyName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(indicativeTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "givenName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(indicativeTypeType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "middleName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(indicativeTypeType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "dob",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(indicativeTypeType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ids",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listActorTasksType,
			 new String[] 
			 {
			 "name", "listActorTasks_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listActorTasksType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "actorId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(listActorTasksType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Filter",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listActorTasksResponseType,
			 new String[] 
			 {
			 "name", "listActorTasksResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listActorTasksResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Tasks",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listInstanceTasksType,
			 new String[] 
			 {
			 "name", "listInstanceTasks_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTasksType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ProcessInstanceId",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTasksType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Filter",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listInstanceTasksResponseType,
			 new String[] 
			 {
			 "name", "listInstanceTasksResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTasksResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Tasks",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listInstanceTokensType,
			 new String[] 
			 {
			 "name", "listInstanceTokens_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTokensType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ProcessInstanceId",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTokensType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Filter",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listInstanceTokensResponseType,
			 new String[] 
			 {
			 "name", "listInstanceTokensResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listInstanceTokensResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Tokens",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listProcessesType,
			 new String[] 
			 {
			 "name", "listProcesses_._type",
			 "kind", "empty"
			 });

		addXSDMapping
		  (listProcessesResponseType,
			 new String[] 
			 {
			 "name", "listProcessesResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listProcessesResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Processes",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
		  (listProcessInstancesType,
			 new String[] 
			 {
			 "name", "listProcessInstances_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listProcessInstancesType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ProcessId",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(listProcessInstancesType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Filter",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (listProcessInstancesResponseType,
			 new String[] 
			 {
			 "name", "listProcessInstancesResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(listProcessInstancesResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ProcessInstances",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
		  (objectRequestTypeType,
			 new String[] 
			 {
			 "name", "ObjectRequestType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(objectRequestTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "objectId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(objectRequestTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "objectClassName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (objectResponseTypeType,
			 new String[] 
			 {
			 "name", "ObjectResponseType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(objectResponseTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Employee",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(objectResponseTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Applicant",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (phoneType,
			 new String[] 
			 {
			 "name", "phone_._type",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(phoneType, 0),
			 new String[]
			 {
			 "name", ":0",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(phoneType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (phonesTypeType,
			 new String[] 
			 {
			 "name", "PhonesType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(phonesTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "phone",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (poolActorsType,
			 new String[] 
			 {
			 "name", "poolActors_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(poolActorsType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "actorId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processType,
			 new String[] 
			 {
			 "name", "process_._type",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(processType, 0),
			 new String[]
			 {
			 "name", ":0",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(processType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "instanceId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processInstanceVOType,
			 new String[] 
			 {
			 "name", "ProcessInstanceVO",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "start",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "processVariables",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isTerminatedImplicitly",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasEnded",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 8),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isSuspended",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 9),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOType, 10),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "ver",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processInstanceVOTypeType,
			 new String[] 
			 {
			 "name", "ProcessInstanceVOType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processInstanceVOTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Instance",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processTypeType,
			 new String[] 
			 {
			 "name", "ProcessType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processTypeType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "ProcessVars",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processTypeType, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "actorId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processTypeType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "processName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processVarsTypeType,
			 new String[] 
			 {
			 "name", "ProcessVarsType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processVarsTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processVOType,
			 new String[] 
			 {
			 "name", "ProcessVO",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasActions",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasEvents",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace",
			 "nillable", "true"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 6),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "running",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 7),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "suspended",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(processVOType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "ended",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (processVOTypeType,
			 new String[] 
			 {
			 "name", "ProcessVOType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(processVOTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Process",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (statusesType,
			 new String[] 
			 {
			 "name", "statuses_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isBlocking",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isCancelled",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isLast",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isOpen",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isSignaling",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isStartInstance",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isSuspended",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(statusesType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasEnded",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tasksTypeType,
			 new String[] 
			 {
			 "name", "TasksType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tasksTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Task",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (taskVOType,
			 new String[] 
			 {
			 "name", "TaskVO",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "process",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comments",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "created",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "dueDate",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "priority",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 8),
			 new String[]
			 {
			 "kind", "element",
			 "name", "start",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 9),
			 new String[]
			 {
			 "kind", "element",
			 "name", "actorId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 10),
			 new String[]
			 {
			 "kind", "element",
			 "name", "poolActors",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 11),
			 new String[]
			 {
			 "kind", "element",
			 "name", "transitions",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 12),
			 new String[]
			 {
			 "kind", "element",
			 "name", "statuses",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 13),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenVariables",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(taskVOType, 14),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tokenStatusesType,
			 new String[] 
			 {
			 "name", "tokenStatuses_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isSuspended",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isAbleToReactivateParent",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isLocked",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isRoot",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isTerminatedmplicitly",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "isTerminatedImplicit",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasActiveChildren",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasEnded",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenStatusesType, 8),
			 new String[]
			 {
			 "kind", "element",
			 "name", "hasParent",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tokensTypeType,
			 new String[] 
			 {
			 "name", "TokensType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tokensTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "Token",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tokenTransitionType,
			 new String[] 
			 {
			 "name", "tokenTransition_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tokenTransitionType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenTransitionType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "from",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenTransitionType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "to",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenTransitionType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tokenTransitionsType,
			 new String[] 
			 {
			 "name", "tokenTransitions_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tokenTransitionsType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenTransition",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (tokenVOType,
			 new String[] 
			 {
			 "name", "TokenVO",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenPath",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "nodeName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comments",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "start",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenTransitions",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 7),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenStatuses",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(tokenVOType, 8),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (transitionType,
			 new String[] 
			 {
			 "name", "transition_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(transitionType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(transitionType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "condition",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(transitionType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "to",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(transitionType, 3),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (transitionsType,
			 new String[] 
			 {
			 "name", "transitions_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(transitionsType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "transition",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (updateTokenType,
			 new String[] 
			 {
			 "name", "updateToken_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "token",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (updateTokenRequestType,
			 new String[] 
			 {
			 "name", "UpdateTokenRequest",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "processId",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 1),
			 new String[]
			 {
			 "kind", "element",
			 "name", "tokenPath",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 2),
			 new String[]
			 {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 3),
			 new String[]
			 {
			 "kind", "element",
			 "name", "transitionName",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 4),
			 new String[]
			 {
			 "kind", "element",
			 "name", "comment",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 5),
			 new String[]
			 {
			 "kind", "element",
			 "name", "localVariables",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenRequestType, 6),
			 new String[]
			 {
			 "kind", "element",
			 "name", "processVariables",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (updateTokenResponseType,
			 new String[] 
			 {
			 "name", "updateTokenResponse_._type",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenResponseType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "updateResponse",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (updateTokenResponseTypeType,
			 new String[] 
			 {
			 "name", "UpdateTokenResponseType",
			 "kind", "elementOnly"
			 });

		addXSDMapping
			(getLocalProperty(updateTokenResponseTypeType, 0),
			 new String[]
			 {
			 "kind", "element",
			 "name", "success",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (valueType,
			 new String[] 
			 {
			 "name", "value_._type",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(valueType, 0),
			 new String[]
			 {
			 "name", ":0",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(valueType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (value1Type,
			 new String[] 
			 {
			 "name", "value_._1_._type",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(value1Type, 0),
			 new String[]
			 {
			 "name", ":0",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(value1Type, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
			(getLocalProperty(value1Type, 2),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "issuedBy",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (varType,
			 new String[] 
			 {
			 "name", "var_._type",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(varType, 0),
			 new String[]
			 {
			 "name", ":0",
			 "kind", "simple"
			 });

		addXSDMapping
			(getLocalProperty(varType, 1),
			 new String[]
			 {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
			 });

		addXSDMapping
		  (actionType,
			 new String[] 
			 {
			 "name", "action_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "SIGNAL RESUME END SUSPEND"
			 });

		addXSDMapping
		  (filterType,
			 new String[] 
			 {
			 "name", "Filter_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "ALL OPEN SUSPENDED ENDED"
			 });

		addXSDMapping
		  (filter1Type,
			 new String[] 
			 {
			 "name", "Filter_._1_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "ALL RUNNING SUSPENDED ENDED"
			 });

		addXSDMapping
		  (filter2Type,
			 new String[] 
			 {
			 "name", "Filter_._2_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "ALL OPEN SUSPENDED SIGNALING ENDED"
			 });

		addXSDMapping
		  (filter3Type,
			 new String[] 
			 {
			 "name", "Filter_._3_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "ALL POOLED ASSIGNED"
			 });

		addXSDMapping
		  (objectClassNameType,
			 new String[] 
			 {
			 "name", "objectClassName_._type",
			 "baseType", "commonj.sdo#String",
			 "enumeration", "opensoa.sca.vo.xsd.EmployeeType"
			 });

  }
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createactionFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertactionToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilterFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilter1FromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilter1ToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilter2FromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilter2ToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilter3FromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilter3ToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createobjectClassNameFromString(String initialValue)
	{
		return (String)((ModelFactoryImpl)ModelFactory.INSTANCE).createStringFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertobjectClassNameToString(Object instanceValue)
	{
		return ((ModelFactoryImpl)ModelFactory.INSTANCE).convertStringToString(instanceValue);
	}

} //XsdFactory
