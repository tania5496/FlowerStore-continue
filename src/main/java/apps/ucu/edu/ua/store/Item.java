package apps.ucu.edu.ua.store;

public abstract class Item {
    private String descripton;
    public String getDescripton(){return descripton;}
    public abstract double price();
}
