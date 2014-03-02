package opensoa.book.chapter4_41;

import opensoa.book.chapter4_41.TicketDO;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponent {
	public int create(TicketDO ticket);
}
