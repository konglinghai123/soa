package opensoa.book.chapter4_1.impl;

import java.util.Random;

import opensoa.book.chapter4_1.*;

public class CreateTicketComponentImpl implements
      CreateTicketComponent {

   public int create(TicketDO ticket) {
      Random r = new Random();

      return r.nextInt(300000);
   }

}
