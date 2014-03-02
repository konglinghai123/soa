package opensoa.book.chapter3_23.impl;

import opensoa.book.chapter3_23.*;

import org.osoa.sca.annotations.Reference;
import org.osoa.sca.annotations.Service;

@Service(ProblemTicketComponent.class)				
 
public class ProblemTicketComponentImpl implements 
ProblemTicketComponent2 {

	private CreateTicketComponent createTicket;				

	public int createTicket(TicketDO ticket) {
		System.out.println(ticket.toString());
		return createTicket.create(ticket);
	}

	@Reference								
	public void setCreateTicket(
			CreateTicketComponent createTicket) {
		this.createTicket = createTicket;
	}

	public boolean deleteTicket(int ticketId) {
		// TODO Auto-generated method stub
		return false;
	}

}
