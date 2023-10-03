package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements  QueueBehaviour, MarkerBehaviour{

    private final List<Actor> actors;

    public Market(List<Actor> actors) {
        this.actors = new ArrayList<>();
        for (Actor actor: actors) {
            acceptToMarker(actor);
        }

    }

    @Override
    public void acceptToMarker(Actor actor) {
        System.out.println(actor.getName() + " пришел в магаз");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarker(List<Actor> actors) {
        for (Actor actor: actors){
            this.actors.remove(actor);
            System.out.println(actor.getName() + " вышел из магаз");

        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.actors.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actors){
            if (!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actors){
            if (actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorExit = new ArrayList<>();
        for (Actor actor : actors){
            if (actor.isTakeOrder())
            {
                actorExit.add(actor);
            }
        }

        releaseFromMarker(actorExit);

    }
}
