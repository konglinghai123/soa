package opensoa.book.chapter3_23;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the HelloWorld greetings service.
 */
@Remotable
public interface ProblemTicketComponent2 {
    public int createTicket(TicketDO ticket);
    public boolean deleteTicket(int ticketId);
}
