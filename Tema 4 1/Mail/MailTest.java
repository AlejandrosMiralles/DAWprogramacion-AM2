package Mail;

public class MailTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient tester = new MailClient(server, "Professional Tester");
        MailClient terminal = new MailClient(server, "Terminal");
    
        tester.sendMailItem("Terminal", "The test failed", "Test's succesfullness");
        tester.sendMailItem(" sdvbon; Fulanito;Terminal; Don José", "The test was succesful", "Mail's Test");
        terminal.printNextMailItem();
        terminal.forwardLastMailItem("Professional Tester");
        tester.printNextMailItem();
        
    }
}
