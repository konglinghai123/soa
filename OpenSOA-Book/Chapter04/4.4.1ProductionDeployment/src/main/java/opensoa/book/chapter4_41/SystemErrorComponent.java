package opensoa.book.chapter4_41;

import org.osoa.sca.annotations.Remotable;

/**
 * This is the business interface of the HelloWorld greetings service.
 */
@Remotable
public interface SystemErrorComponent {
    public int systemProblem(String system, String title,String problem);
}
