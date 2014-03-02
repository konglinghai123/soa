package opensoa.book.chapter4_42;


import opensoa.book.chapter4.issue.createTicket;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the ProblemTicket service.
 */
@Remotable
public interface ProblemTicketComponentSDO {
    public int createTicket(createTicket ticket);
}
