package opensoa.book.chapter4_42;

import opensoa.book.chapter4.issue.createTicket;

import org.osoa.sca.annotations.Remotable;


/**
 * The interface for the SDOClient
 */
@Remotable
public interface SDOClient {
    public int createTicket(createTicket ticket);
}
