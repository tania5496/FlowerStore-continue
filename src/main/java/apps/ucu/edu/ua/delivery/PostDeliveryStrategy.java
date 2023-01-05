package apps.ucu.edu.ua.delivery;

import lombok.ToString;
import java.util.LinkedList;
import java.util.Map;

@ToString
public class PostDeliveryStrategy implements Delivery{
    @Override
    public double getPrice() {
        return 45;
    }
    @Override
    public boolean setOrder() {
        return true;
    }
    @Override
    public void deliver(LinkedList items) {
        System.out.println("Hey, your flowers were delivered by post delivery!");
    }
    @Override
    public Map<String, String> getDescription() {
        return Map.of("Type", "Post", "Price", String.valueOf(this.getPrice()));
    }

}
