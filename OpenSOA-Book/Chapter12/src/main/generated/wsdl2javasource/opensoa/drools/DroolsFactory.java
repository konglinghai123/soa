/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface DroolsFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DroolsFactory INSTANCE = opensoa.drools.impl.DroolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manage Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manage Response Type</em>'.
	 * @generated
	 */
	ManageResponseType createManageResponseType();

	/**
	 * Returns a new object of class '<em>Manage Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manage Service Type</em>'.
	 * @generated
	 */
	ManageServiceType createManageServiceType();

  /**
   * Registers the types supported by this Factory within the supplied scope.argument
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param scope an instance of HelperContext used to manage the scoping of types.
	 * @generated
   */
  public void register(HelperContext scope);
   
} //DroolsFactory
