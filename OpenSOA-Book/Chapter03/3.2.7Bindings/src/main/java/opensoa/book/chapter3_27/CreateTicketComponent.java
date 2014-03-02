package opensoa.book.chapter3_27;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponent {
	public int create(TicketDO ticket);
}
