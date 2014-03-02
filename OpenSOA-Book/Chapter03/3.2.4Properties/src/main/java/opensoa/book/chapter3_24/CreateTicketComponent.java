package opensoa.book.chapter3_24;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponent {
	public int create(TicketDO ticket);
}
