import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Actor> actorList= new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " go to the shop");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor : actors){
            System.out.println(actor.getName() + " go out to the shop");
            actorList.remove(actor);
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
        System.out.println(actor.getName() + " take in queue");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor : actorList){
            if(!actor.isMakeOrder){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " make the order");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor : actorList){
            if(!actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " take the order");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor : actorList){
            if(!actor.isTakeOrder){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " go out to the queue");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
