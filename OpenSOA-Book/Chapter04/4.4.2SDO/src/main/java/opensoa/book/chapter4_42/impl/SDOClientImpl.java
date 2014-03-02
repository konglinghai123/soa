
package opensoa.book.chapter4_42.impl;

import org.osoa.sca.annotations.Reference;

import opensoa.book.chapter4_42.*;
import opensoa.book.chapter4.issue.*;

/**
 * The JMSClient Implementation
 */

public class SDOClientImpl implements ProblemTicketComponentSDO {

   @Reference
   public SDOClient sdoClient;

   public int createTicket(createTicket ticket) {
      int rval = sdoClient.createTicket(ticket);
      
      System.out.println("rval: " + rval);
      return rval;
   } 
}