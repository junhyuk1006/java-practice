package menu;

import java.util.HashMap;
import java.util.Scanner;

public class Member {

    HashMap<String,String> repository = new HashMap<>();
    Scanner sc=new Scanner(System.in);
    public boolean flag = false;

    public void join(){
        System.out.println("사용하실 아이디를 입력해주세요.");
        String id = sc.next();
        if(!repository.containsKey(id)){
            System.out.println("사용하실 비밀번호를 입력해주세요");
            String password = sc.next();
            repository.put(id,password);
            flag = true;
        }else {
            System.out.println("이 아이디는 사용중입니다.다른 아이디를 입력해주세요.");
        }
    }

    public void login(){
        System.out.println("아이디를 입력해주세요.");
        String id = sc.next();
        if(repository.containsKey(id)){
            System.out.println("비밀번호를 입력해주세요.");
            String password = sc.next();
            if(repository.get(id).equals(password)){
                System.out.println("로그인 성공!");
                flag = true;
            }
        }else {
            System.out.println("아이디를 잘못 입력하셨습니다.");
        }
    }
}
