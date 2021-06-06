package trafficlight.Observer;

import trafficlight.states.State;

public interface Observer {
   public void update(State state);
}
