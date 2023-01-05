package apps.ucu.edu.ua.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of( new Flower(7, FlowerColor.RED,60, FlowerType.CHAMOMILE),
                new Flower(5, FlowerColor.BLUE, 20, FlowerType.ROSE),
                new Flower(2.5, FlowerColor.PINK, 10, FlowerType.TULIP));
    }
}