package apps.ucu.edu.ua.store;

import apps.ucu.edu.ua.flower.store.Item;
import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private double price;
    @Getter
    private ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();
    FlowerBucket() {
        price = 0;
    }
    public double getPrice() {
        return price;
    }
    public void add(FlowerPack pack) {
        packList.add(pack);
        price += pack.getPrice();
    }
    @Override
    public double price() {
        return price;
    }
}
