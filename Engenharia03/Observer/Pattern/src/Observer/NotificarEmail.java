package Observer;

public class EmailNotifier implements Observer{
    
    public void update(){
        System.out.println("Notificar por e-mail");
    }

}
