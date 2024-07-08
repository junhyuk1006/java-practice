package menu;

import set.User;

import java.util.Scanner;

public class Batting {
    public void play(User user){
        System.out.println("투입한 금액의 0.01배부터 100배까지 랜덤으로 돈이 반환됩니다!");
        System.out.println("투입할 금액을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        user.setMoney(user.getMoney()-money);
        System.out.println("소지머니에서" + money + "만큼을 잃습니다. " + "남은 소지머니는" + user.getMoney() + "입니다");
        System.out.println("돈을 뽑고 있습니다!");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        double getMoney = money*((Math.random()*10)+0.01);
        System.out.println("돈이 " + Math.round(getMoney) + "만큼 반환됩니다!!");
        user.setMoney(user.getMoney()+(int)getMoney);
        System.out.println("소지머니가 " + user.getMoney() + "가 되었습니다!");
    }
}
