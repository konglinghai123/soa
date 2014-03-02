package opensoa.book.chapter4_21;

import opensoa.book.chapter4_21.TicketDO;

import org.osoa.sca.annotations.Remotable;

@Remotable
public interface CreateTicketComponent {
	public int create(TicketDO ticket);
}
