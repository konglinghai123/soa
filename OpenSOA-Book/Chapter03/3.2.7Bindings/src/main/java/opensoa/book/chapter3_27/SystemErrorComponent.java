package opensoa.book.chapter3_27;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the HelloWorld greetings service.
 */
@Remotable
public interface SystemErrorComponent {
    public int systemProblem(SystemErrorDO ticket);
}
