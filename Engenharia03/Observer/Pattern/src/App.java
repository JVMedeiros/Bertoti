import Observer.EmailNotifier;
import Observer.SMSNotifier;

public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        controller.addObserver(new EmailNotifier());
        controller.addObserver(new SMSNotifier());
        controller.notificar();

    }
}
