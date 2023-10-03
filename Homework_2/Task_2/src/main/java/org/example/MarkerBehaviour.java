package org.example;

import java.util.List;

public interface MarkerBehaviour {
    void acceptToMarker(Actor actor);
    void releaseFromMarker(List<Actor> actors);

    void update();
}
