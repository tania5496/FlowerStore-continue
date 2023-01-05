package apps.ucu.edu.ua.order;

import apps.ucu.edu.ua.delivery.Delivery;
import apps.ucu.edu.ua.store.Item;
import apps.ucu.edu.ua.payment.Payment;
import lombok.Getter;
import lombok.ToString;
import java.util.LinkedList;
@ToString @Getter
public class Order {
    private Payment payment;
    private Delivery delivery;
    private LinkedList<Item> items;
    public void setPaymentStrategy(Payment paymentType) {
        this.payment = paymentType;}

    public void setDeliveryStrategy(Delivery deliveryType) {
        this.delivery = deliveryType;}

    public double calculateTotalPrice(){
        double price = 0;
        for (Item item : items) {
            price += item.price();}
        return price;}

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
    public void processOrder() {
        System.out.println("Processing order...\n" + "Type of delivery: " + delivery.getClass() +
                "\n" + "Type of payment: " + payment.getClass());
    }
}
