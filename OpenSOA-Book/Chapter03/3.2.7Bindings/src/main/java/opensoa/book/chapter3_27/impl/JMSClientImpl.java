
package opensoa.book.chapter3_27.impl;

import org.osoa.sca.annotations.Reference;

import opensoa.book.chapter3_27.*;

/**
 * The JMSClient Implementation
 */

public class JMSClientImpl implements JMSClient {

   @Reference
   public JMSClient jmsClient;
   
   public int systemProblem(SystemErrorDO ticket) {
      
      int rval = jmsClient.systemProblem(ticket);
      System.out.println("rval: " + rval);
      return rval;
   }
   

}