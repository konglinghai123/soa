package opensoa8_61.esper.jbpm.functions;

public class HelperFunctions {
  
  public static String lookupCustomer(Integer custId) {
    switch(custId) {
      case 100: return "Acme"; 
      case 101: return "Umbrella Corporation";
      case 102: return "Cybergen Inc";
      case 103: return "Whynot Corp";
      case 104: return "AAFirst"; 
      case 105: return "GiantCorp"; 
    }
    return "NothingFoundCorp";
  }
}
