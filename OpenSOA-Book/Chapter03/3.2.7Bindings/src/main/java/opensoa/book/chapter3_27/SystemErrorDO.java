package opensoa.book.chapter3_27;

import java.io.Serializable;

public class SystemErrorDO implements Serializable {

   private String system;
   private String title;
   private String problem;
   private static final long serialVersionUID = 1L;
   
   public String getSystem() {
      return system;
   }
   public void setSystem(String system) {
      this.system = system;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getProblem() {
      return problem;
   }
   public void setProblem(String problem) {
      this.problem = problem;
   }
   
}
