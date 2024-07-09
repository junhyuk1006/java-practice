package set;

public class Boss {
    private int power;
    private int money;

    public Boss[] bossSetting(){
        Boss boss1 = new Boss(1000,10000);
        Boss boss2 = new Boss(10000,100000);
        Boss boss3 = new Boss(100000,1000000);
        Boss boss4 = new Boss(1000000,100000000);
        Boss boss5 = new Boss(10000000,1000000000);

        return new Boss[]{boss1,boss2,boss3,boss4,boss5};
    }

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
