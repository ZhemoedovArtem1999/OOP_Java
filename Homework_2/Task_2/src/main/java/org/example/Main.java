package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Actor> actorList = new ArrayList<>();
        actorList.add(new Human("Федя"));
        actorList.add(new Human("Вася"));

        Market market = new Market(actorList);

        market.acceptToMarker(new Human("Алина"));

        market.update();

    }
}
