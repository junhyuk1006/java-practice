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

        // 무기 설정
        Item item = new Item("wood",30000,100000);

        // 생성자
        Battle battle = new Battle();
        while(true) {
            System.out.println("행동을 선택하세요");
            System.out.println("1.전투 2 .내 정보 확인 3.무기 상점 4.도박 5.로그아웃");
            int choice = sc.nextInt();
            if(choice == 5) break;
            switch (choice) {
                case 1:
                    int stage = 0;
                    while(true){
                        battle.message();
                        stage = sc.nextInt();
                        if(stage==1||stage==2||stage==3||stage==4||stage==5){
                            break;
                        }else{
                            System.out.println("잘못입력하셨습니다.");
                        }
                    }
                    Boss sBoss = battle.bossSelect(stage);// 보스생성,선택
                    battle.action(user,sBoss);
                    break;

                case 2:
                    System.out.println("내 전투력은"+user.getPower()+"입니다.");
                    System.out.println("내 소지머니는"+user.getMoney()+"입니다.");
                    if(user.getItem() == null){
                        System.out.println("장착 무기가 없습니다.");
                    }else {
                        System.out.println("내 장착무기는"+user.getItem()+"입니다.");
                    }
                    break;

                case 3:
                    break;

                case 4:
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