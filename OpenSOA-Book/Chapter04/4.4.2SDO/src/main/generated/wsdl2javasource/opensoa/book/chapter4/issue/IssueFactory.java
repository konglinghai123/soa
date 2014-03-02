/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.book.chapter4.issue;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface IssueFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IssueFactory INSTANCE = opensoa.book.chapter4.issue.impl.IssueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ccs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ccs Type</em>'.
	 * @generated
	 */
	CcsType createCcsType();

	/**
	 * Returns a new object of class '<em>create Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>create Ticket</em>'.
	 * @generated
	 */
	createTicket createcreateTicket();

	/**
	 * Returns a new object of class '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Type</em>'.
	 * @generated
	 */
	HeaderType createHeaderType();

	/**
	 * Returns a new object of class '<em>Problem Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Type</em>'.
	 * @generated
	 */
	ProblemType createProblemType();

  /**
   * Registers the types supported by this Factory within the supplied scope.argument
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param scope an instance of HelperContext used to manage the scoping of types.
	 * @generated
   */
  public void register(HelperContext scope);
   
} //IssueFactory
