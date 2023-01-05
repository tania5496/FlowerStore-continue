package apps.ucu.edu.ua.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Store {
    @Getter@Setter
    private List<Flower> flowerAssortment = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowerAssortment.add(flower);
    }
    public boolean search(Flower wantedFlower) {
        for (Flower flower: flowerAssortment) {
            if (wantedFlower.getType().equals(flower.getType()) && wantedFlower.getColor().equals(flower.getColor())
                    && wantedFlower.getPrice() == flower.getPrice()) {
                return true;
            }
        }
        return false;
    }
}
