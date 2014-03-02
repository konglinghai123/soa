package opensoa.drools.service;

import java.io.IOException;

import org.apache.tuscany.sca.host.embedded.SCADomain;

public class DroolsManagerMain {

  public static void main(String[] args) {
    DroolsManagerMain server = new DroolsManagerMain();
    server.run();
  }
  
  public void run() {
    System.out.println("Running");
    SCADomain scaDomain = SCADomain.newInstance("Drools.composite");
    
    try {
        System.out.println("Drools server started (press enter to shutdown)");
        System.in.read();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
