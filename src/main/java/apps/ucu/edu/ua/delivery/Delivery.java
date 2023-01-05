package apps.ucu.edu.ua.delivery;

import java.util.LinkedList;
import java.util.Map;

public interface Delivery {
    double getPrice();
    boolean setOrder();
    void deliver(LinkedList items);
    Map<String,String> getDescription();

}