public class Controlador {
    
    private EmailNotification email = new EmailNotification();
    private SMSNotification sms = new SMSNotification();

    public void notificador(){
        email.enviarEmail();
        sms.enviarSMS();
    }

}
