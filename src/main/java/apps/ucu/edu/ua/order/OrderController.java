package apps.ucu.edu.ua.order;

import apps.ucu.edu.ua.delivery.DHLDeliveryStrategy;
import apps.ucu.edu.ua.delivery.PostDeliveryStrategy;
import apps.ucu.edu.ua.payment.CreditCardPaymentStrategy;
import apps.ucu.edu.ua.payment.PayPalPaymentStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/orders")
public class OrderController {
    @GetMapping
    public List<String> getOrdersDetails() {
        Order order1 = new Order();

        order1.setPaymentStrategy(new CreditCardPaymentStrategy());
        order1.setDeliveryStrategy(new PostDeliveryStrategy());

        Order order2 = new Order();

        order2.setPaymentStrategy(new PayPalPaymentStrategy());
        order2.setDeliveryStrategy(new DHLDeliveryStrategy());
        return List.of(order1.toString(), order2.toString());
    }
}
