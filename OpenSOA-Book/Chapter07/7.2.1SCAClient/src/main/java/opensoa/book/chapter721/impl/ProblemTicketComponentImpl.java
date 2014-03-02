package opensoa.book.chapter721.impl;

import java.util.Random;

import opensoa.book.chapter721.*;
import org.osoa.sca.annotations.Service;

@Service(ProblemTicketComponent.class)
public class ProblemTicketComponentImpl implements ProblemTicketComponent {

  public int createTicket(TicketDO ticket) {
    System.out.println(ticket.toString());
    Random r = new Random();
    return r.nextInt(300000);
  }

}
