package menu;

import set.Boss;
import set.User;

public class Battle {
    public void startMessage(){
        System.out.println("전투를 시작합니다.스테이지를 선택하세요");
        System.out.println("1.파란 달팽이 2.파이어보어 3.머쉬맘 4.주니어발록 5.자쿰");
    }

    public Boss[] bossSetting(){
        Boss boss1 = new Boss(1000,10000);
        Boss boss2 = new Boss(10000,100000);
        Boss boss3 = new Boss(100000,1000000);
        Boss boss4 = new Boss(1000000,100000000);
        Boss boss5 = new Boss(10000000,1000000000);

        return new Boss[]{boss1,boss2,boss3,boss4,boss5};
    }

    public void action(User user, Boss boss){
        System.out.println("보스와 전투합니다.");
        if(user.getPower()>boss.getPower()){
            System.out.println("승리했습니다!"+boss.getMoney()+"원을 획득합니다.");
            user.setMoney(boss.getMoney()+ user.getMoney());
        }
        else {
            System.out.println("패배하였습니다! 강해져서 도전하십시오.");
        }
    }
}
