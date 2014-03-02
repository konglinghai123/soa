package opensoa.book.chapter4_41;

import java.io.Serializable;

/* Data object used to store the details of the problem ticket. 
 * Note: You must make it serializable, or you can't pass to a
 * reference class without receiving "Pass-by-value is not 
 * supported for the given object" error.
 */
public class TicketDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerEmail;
	private String customerName;
	private String subject;
	private String problemDesc;
	private int caseNumber;
	private String source;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProblemDesc() {
		return problemDesc;
	}

	public void setProblemDesc(String problemDesc) {
		this.problemDesc = problemDesc;
	}

	public int getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String toString() {
		String rval = "******** PROBLEM TICKET *******\n";
		rval += "Customer Email: " + customerEmail + "\n";
		rval += "Customer Name: " + customerName + "\n";
		rval += "Subject: " + subject + "\n";
		rval += "Description: " + problemDesc + "\n";
		rval += "******** END OF PROBLEM TICKET *******\n";
		return rval;

	}

}
