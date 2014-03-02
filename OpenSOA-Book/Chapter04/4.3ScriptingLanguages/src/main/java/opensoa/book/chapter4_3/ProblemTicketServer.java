package opensoa.book.chapter4_3;

import java.io.IOException;

import org.apache.tuscany.sca.host.embedded.SCADomain;

/**
 * This server program shows how to create an SCA runtime, and start it which
 * activates the ProblemTicketService Web service endpoint.
 */
public class ProblemTicketServer {

    public static void main(String[] args) {

       SCADomain scaDomain = SCADomain.newInstance("problemMgmt43.composite");

       try {
            System.out.println("ProblemManagement server started (press enter to shutdown)");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        scaDomain.close();
        System.out.println("ProblemManagement server stopped");
    }
}
