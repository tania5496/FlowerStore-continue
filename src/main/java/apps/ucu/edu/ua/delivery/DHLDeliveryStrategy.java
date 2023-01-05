package apps.ucu.edu.ua.delivery;

import lombok.ToString;

import java.util.LinkedList;
import java.util.Map;

@ToString
public class DHLDeliveryStrategy implements Delivery{
    @Override
    public double getPrice() {
        return 50;
    }
    @Override
    public boolean setOrder() {
        return true;
    }
    @Override
    public void deliver(LinkedList items) {
        System.out.println("Hey, your flowers were delivered by DHL delivery!");
    }
    @Override
    public Map<String, String> getDescription() {
        return Map.of("Type", "DHL", "Price", String.valueOf(this.getPrice()));
    }
}
