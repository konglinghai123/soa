package opensoa.book.chapter3_26;

import java.io.IOException;

import org.apache.tuscany.sca.host.embedded.SCADomain;

public class SystemErrorServer {

    public static void main(String[] args) {

       SCADomain scaDomain = SCADomain.newInstance("issueMgmt326.composite");

       try {
            System.out.println("IssueManagement server started (press enter to shutdown)");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        scaDomain.close();
        System.out.println("IssueManagement server stopped");
    }
}

