package opensoa.book.chapter3_23;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the ProblemTicket service.
 */
@Remotable
public interface ProblemTicketComponent {
    public int createTicket(TicketDO ticket);
}
