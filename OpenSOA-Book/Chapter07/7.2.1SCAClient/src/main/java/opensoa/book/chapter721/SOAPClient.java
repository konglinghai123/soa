package opensoa.book.chapter721;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface SOAPClient {
    public int createTicket(TicketDO ticket);
}
