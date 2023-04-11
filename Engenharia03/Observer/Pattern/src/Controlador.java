import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class Controller {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void notifier(){
        for(Observer o :observers){
            o.update();
        }
    }

}
