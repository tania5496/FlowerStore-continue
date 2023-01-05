package apps.ucu.edu.ua.payment;

import java.util.Map;

public interface Payment {
    boolean pay(double price);
    Map<String, String> getDetails();
}
