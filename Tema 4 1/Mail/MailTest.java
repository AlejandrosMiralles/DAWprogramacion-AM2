package Mail;

public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient tester = new MailClient(server, "Professional Tester");
    
        tester.sendMailItem("Terminal", "The test was succesful", "Mail's Test");
        tester.printNextMailItem();
        
    }
}
