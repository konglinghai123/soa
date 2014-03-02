package opensoa.sca;

import java.io.IOException;
import org.apache.tuscany.sca.host.embedded.SCADomain;

public class Server {

 public static void main(String[] args) {

  SCADomain scaDomain = SCADomain.newInstance("jbpm.composite");

  try {
       System.out.println("JBPM server started (press enter to shutdown)");
       System.in.read();
   } catch (IOException e) {
       e.printStackTrace();
   }

   scaDomain.close();
   System.out.println("Server stopped");
}
	/*
	public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }
    public void run() {
        System.out.println("Running");
        SCADomain scaDomain = SCADomain.newInstance("jbpm.composite");

        }
*/
}
