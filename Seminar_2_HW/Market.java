package Seminar_2_HW;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehaviour {

    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.printf("В магазин зашел новый покупатель %s!\n", actor.name);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        queue.removeAll(actors);
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder == false) actor.isMakeOrder = true;
            System.out.printf("Покупатель %s сделал заказ!\n", actor.name);
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder == true) actor.isTakeOrder = true;
            System.out.printf("Покупатель %s получил заказ!\n", actor.name);
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder == true) {
                System.out.printf("Покупатель %s покинул магазин!\n", actor.name);
                actors.add(actor);
            }          
        }
        releaseFromMarket(actors);
    }
}
