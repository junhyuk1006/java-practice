package set;

public class Boss {
    private int power;
    private int money;

    public Boss(){

    }

    public Boss(int power, int money) {
        this.power = power;
        this.money = money;
    }

    public int getPower() {
        return power;
    }

    public int getMoney() {
        return money;
    }

    public int dropMoney(){
        return money;
    }

}
