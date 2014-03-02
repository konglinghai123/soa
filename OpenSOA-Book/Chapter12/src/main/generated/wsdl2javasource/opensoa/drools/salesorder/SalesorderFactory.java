/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.drools.salesorder;

import commonj.sdo.helper.HelperContext;
import org.apache.tuscany.sdo.helper.HelperContextImpl;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface SalesorderFactory
{

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SalesorderFactory INSTANCE = opensoa.drools.salesorder.impl.SalesorderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>header</em>'.
	 * @generated
	 */
	header createheader();

	/**
	 * Returns a new object of class '<em>lines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>lines</em>'.
	 * @generated
	 */
	lines createlines();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Price Calculator Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Calculator Request</em>'.
	 * @generated
	 */
	PriceCalculatorRequest createPriceCalculatorRequest();

	/**
	 * Returns a new object of class '<em>Price Calculator Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Calculator Response</em>'.
	 * @generated
	 */
	PriceCalculatorResponse createPriceCalculatorResponse();

	/**
	 * Returns a new object of class '<em>product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>product</em>'.
	 * @generated
	 */
	product createproduct();

	/**
	 * Returns a new object of class '<em>shipping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>shipping</em>'.
	 * @generated
	 */
	shipping createshipping();

  /**
   * Registers the types supported by this Factory within the supplied scope.argument
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param scope an instance of HelperContext used to manage the scoping of types.
	 * @generated
   */
  public void register(HelperContext scope);
   
} //SalesorderFactory
