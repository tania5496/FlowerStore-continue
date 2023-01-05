package apps.ucu.edu.ua;
import apps.ucu.edu.ua.flower.store.Flower;
import apps.ucu.edu.ua.flower.store.FlowerBucket;
import apps.ucu.edu.ua.flower.store.FlowerPack;
import apps.ucu.edu.ua.flower.store.Rose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerBucketTest {
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = MAX_PRICE;
        int quantity = MAX_QUANTITY;
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }
}
