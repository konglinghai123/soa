package opensoa.book.chapter4_22;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponent {
	public int create(TicketDO ticket);
}
