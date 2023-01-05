package apps.ucu.edu.ua.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    public Flower(double sepalLength, apps.ucu.edu.ua.store.FlowerColor color, double price, apps.ucu.edu.ua.store.FlowerType flowerType){
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }
    public Flower(){
        this.sepalLength = 0;
        this.color = null;
        this.price = 0;
        this.flowerType = null;
    }
    public String getColor() {
        return color.toString();
    }
    public String getType() {
        return flowerType.toString();
    }
    @Override
    public double price() {
        return price;
    }
}