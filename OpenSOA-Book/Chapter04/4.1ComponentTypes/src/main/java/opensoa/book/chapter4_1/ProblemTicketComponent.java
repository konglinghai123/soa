package opensoa.book.chapter4_1;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the ProblemTicket service.
 */
@Remotable
public interface ProblemTicketComponent {
    public int createTicket(TicketDO ticket);
}
