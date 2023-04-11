public class Controlador {
    
    private EmailNotification email = new EmailNotification();
    private SMSNotification sms = new SMSNotification();

    public void notifier(){
        email.sendEmail();
        sms.sendSMS();
    }

}
