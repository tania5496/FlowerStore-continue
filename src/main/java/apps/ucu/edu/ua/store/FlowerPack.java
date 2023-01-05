package apps.ucu.edu.ua.store;

import lombok.Getter;

public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
    private int quantity;
    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return quantity*flower.getPrice();
    }
}

