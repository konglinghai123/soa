package opensoa.book.chapter3_23.impl;

import java.util.Random;

import opensoa.book.chapter3_23.CreateTicketComponent;
import opensoa.book.chapter3_23.TicketDO;

public class CreateTicketComponentImpl implements
      CreateTicketComponent {

   public int create(TicketDO ticket) {
      Random r = new Random();
      return r.nextInt(300000);
   }

}
