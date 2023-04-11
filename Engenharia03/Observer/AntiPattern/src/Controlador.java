public class Controller {
    
    private EmailNotifier email = new EmailNotifier();
    private SMSNotifier sms = new SMSNotifier();

    public void notifier(){
        email.sendEmail();
        sms.sendSMS();
    }

}
