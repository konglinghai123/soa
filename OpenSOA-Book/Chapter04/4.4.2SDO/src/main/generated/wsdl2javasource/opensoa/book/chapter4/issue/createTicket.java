/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package opensoa.book.chapter4.issue;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>create Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link opensoa.book.chapter4.issue.createTicket#getProblem <em>Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @extends Serializable
 * @generated
 */
public interface createTicket extends Serializable
{
	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference.
	 * @see #setProblem(ProblemType)
	 * @generated
	 */
	ProblemType getProblem();

	/**
	 * Sets the value of the '{@link opensoa.book.chapter4.issue.createTicket#getProblem <em>Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' containment reference.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(ProblemType value);

} // createTicket
