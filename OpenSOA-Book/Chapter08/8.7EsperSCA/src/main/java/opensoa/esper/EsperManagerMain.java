package opensoa.esper;

import org.apache.tuscany.sca.host.embedded.SCADomain;

public class EsperManagerMain {

  public static void main(String[] args) {
    EsperManagerMain server = new EsperManagerMain();
    server.run();
  }
  
  public void run() {
    System.out.println("Running");
    SCADomain scaDomain = SCADomain.newInstance("esper.composite");
  }
}
