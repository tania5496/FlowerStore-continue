package apps.ucu.edu.ua.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/deliveries")
public class DeliverController {
    @GetMapping
    public List<Map> getDeliveriesDetails() {
        return List.of(new DHLDeliveryStrategy().getDescription(),
                new PostDeliveryStrategy().getDescription());
    }
}

