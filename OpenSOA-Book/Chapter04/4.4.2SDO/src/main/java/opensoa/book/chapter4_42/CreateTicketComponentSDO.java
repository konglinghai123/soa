package opensoa.book.chapter4_42;

import opensoa.book.chapter4.issue.ProblemType;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponentSDO {
	public int create(ProblemType ticket);
}
