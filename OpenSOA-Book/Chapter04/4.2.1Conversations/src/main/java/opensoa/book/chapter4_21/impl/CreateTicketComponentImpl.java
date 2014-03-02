package opensoa.book.chapter4_21.impl;

import java.util.Random;

import org.osoa.sca.annotations.Reference;

import opensoa.book.chapter4_21.*;

public class CreateTicketComponentImpl implements CreateTicketComponent {

	@Reference
	protected SessionManager sessionManager;

	public int create(TicketDO ticket) {
		
		System.out.println("createTicket sessionManager: " + sessionManager.getSessionId());
		
		Random r = new Random();

		return r.nextInt(300000);
	}

}
