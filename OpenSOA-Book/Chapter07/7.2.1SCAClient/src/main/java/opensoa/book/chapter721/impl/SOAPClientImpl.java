package opensoa.book.chapter721.impl;

import opensoa.book.chapter721.*;
import org.osoa.sca.annotations.Reference;

public class SOAPClientImpl implements SOAPClient {

   @Reference
   public SOAPClient soapClient;
   
   public int createTicket(TicketDO ticket) {      
      int rval = soapClient.createTicket(ticket);
      return rval;
   }
}