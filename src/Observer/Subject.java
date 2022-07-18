package Observer;

import java.util.ArrayList;
import java.util.List;



public class Subject {
    private List<Subscriber>observers = new ArrayList<>();
    private int state;
    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void subscribe(Subscriber observer){
        observers.add(observer);
    }
    public void unsubscribe(Subscriber observer){
        observers.remove(observer);
    }
    public void notifyAllObservers(){
        for (Subscriber observer:observers){
            observer.update();
        }
    }

}
