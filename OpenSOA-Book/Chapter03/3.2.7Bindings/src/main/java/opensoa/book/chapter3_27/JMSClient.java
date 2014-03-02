package opensoa.book.chapter3_27;

import org.osoa.sca.annotations.Remotable;


/**
 * The interface for the JMSClient
 */
@Remotable
public interface JMSClient {
    public int systemProblem(SystemErrorDO ticket);
}
