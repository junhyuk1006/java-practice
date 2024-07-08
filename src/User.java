public class User {
    private int power;
    private int money;
    private Item item;

    public User(int power,int money,Item item) {
        this.power = power;
        this.money = money;
        this.item = item;
    }

    public int getPower() {
        return power;
    }

    public int getMoney() {
        return money;
    }

    public Item getItem() {
        return item;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
