package opensoa.book.chapter4_3;

public interface EmailServiceComponent {
   public String email(String from, String to, 
            String subject, String body, String caseNo);
}
