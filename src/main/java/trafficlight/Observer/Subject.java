package trafficlight.Observer;

import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> obs = new ArrayList<>();

    public void addObserver(Observer ob){
        obs.add(ob);
    }

    public void removeObserver(Observer ob){
        obs.remove(ob);
    }

    public void notifyObservers(State state){
        for(Observer item : obs){
            item.update(state);
        }
    }

}
