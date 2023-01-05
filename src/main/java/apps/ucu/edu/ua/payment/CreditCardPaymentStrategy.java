package apps.ucu.edu.ua.payment;

import lombok.ToString;
import java.util.Map;

@ToString
public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("The price is paid :)");
        return true;
    }
    @Override
    public Map<String, String> getDetails() {
        return Map.of("Payment type", "Credit Card");
    }
}
