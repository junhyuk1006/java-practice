package set;

public class Item {
    private String name;
    private int price;
    private int power;

    public Item(String name,int price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
