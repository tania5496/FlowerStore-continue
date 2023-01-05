package apps.ucu.edu.ua.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/payments")
public class PaymentController {
    @GetMapping
    public List<Map> getPaymentDetails() {
        return List.of(new PayPalPaymentStrategy().getDetails(), new CreditCardPaymentStrategy().getDetails());}
    }
