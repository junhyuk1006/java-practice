import menu.Batting;
import menu.Battle;
import menu.Member;
import menu.Shop;
import set.Boss;
import set.Item;
import set.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("펀치게임에 오신걸 환영합니다.");
        Scanner sc = new Scanner(System.in);
        Member member = new Member();


        //회원가입,로그인
        while (true){
            System.out.println("회원가입을 하려면 1번, 로그인을 하려면 2번을 눌러주세요.");
            int num = sc.nextInt();
                if(num == 1){
                    while (true){
                        member.join();
                        if(member.flag) break;
                    }
                    break;
                }
                else if(num == 2){
                    while (true){
                        member.login();
                        if(member.flag) break;
                    }
                    break;
                }
                else {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                }
        }

        // 게임시작
        System.out.println("게임이 시작되었습니다.");

        // 유저 설정
        User user = new User(1500,0,null);

        // 생성자
        Battle battle = new Battle();
        Shop shop = new Shop();
        Boss boss = new Boss();
        // 보스 세팅
        Boss[] bosses = boss.bossSetting();
        // 아이템 세팅
        Item[] items = shop.itemSetting();
        while(true) {
            System.out.println("행동을 선택하세요");
            System.out.println("1.전투 2 .내 정보 확인 3.무기 상점 4.도박 5.로그아웃");
            int choice = sc.nextInt();
            if(choice == 5) break;
            switch (choice) {
                case 1:
                    int stage = 0;
                    while(true){
                        battle.startMessage();
                        stage = sc.nextInt();
                        if(stage==1||stage==2||stage==3||stage==4||stage==5){
                            break;
                        }else{
                            System.out.println("잘못입력하셨습니다.");
                        }
                    }
                    battle.action(user,bosses[stage-1]); // 보스생성,선택
                    break;

                case 2:
                    System.out.println("내 전투력은"+user.getPower()+"입니다.");
                    System.out.println("내 소지머니는"+user.getMoney()+"입니다.");
                    if(user.getItem() == null){
                        System.out.println("장착 무기가 없습니다.");
                    }else {
                        System.out.println("내 장착무기는"+user.getItem().getName()+"입니다.");
                    }
                    break;

                case 3:

                    while(true){
                        System.out.println("무기 정보를 확인하려면 1번, 구매를 원하시면 2번을 눌러주세요");
                        int num = sc.nextInt();
                        if(num == 1){
                            shop.itemShow(items);
                        }
                        else if(num == 2) {
                            while(true){
                                System.out.println("구매를 원하시는 무기 번호를 선택해주세요");
                                int num2 = sc.nextInt();
                                if(num2==1||num2==2||num2==3||num2==4){
                                    boolean a = shop.itemBuy(num2,items,user);
                                    if(a) break;
                                    else{
                                        System.out.println("돈이 부족합니다.메인화면으로 이동합니다");
                                        break;
                                    }
                                }else{
                                    System.out.println("잘못입력하셨습니다.");
                                }
                            }
                            break;
                        }
                        else {
                            System.out.println("잘못입력하셨습니다. 번호를 다시 입력해주세요");
                        }
                    }
                    break;

                case 4:
                    Batting batting = new Batting();
                    batting.play(user);
                    break;

                default:
                    System.out.println("번호를 다시 선택하세요");
                    break;
            }
            System.out.println("메인화면으로 이동합니다.");

        }
        //게임 끝
        System.out.println("게임이 종료되었습니다.");
    }
}