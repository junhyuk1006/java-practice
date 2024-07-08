package menu;

import set.Item;
import set.User;

public class Shop {

    public Item[] itemSetting(){
        Item item1 = new Item("wood",30000,100000);
        Item item2 = new Item("knife",60000,150000);
        Item item3 = new Item("sword",120000,200000);
        Item item4 = new Item("gun",150000,250000);

        Item[] items = {item1,item2,item3,item4};
        return items;
    }

    public void itemShow(Item[] items){
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1 + "번 무기: " + items[i].getName() + ", 가격: " + items[i].getPrice()+", 공격력: " + items[i].getPower());
        }
    }

    public boolean itemBuy(int num, Item[] items,User user){
        if (items[num-1].getPrice()> user.getMoney()){
            return false;
        }else {
            System.out.println(items[num-1].getName() + "을 구매하셨습니다!");
            user.setPower(user.getPower()+items[num-1].getPower()); // 유저 전투력 설정
            user.setMoney(user.getMoney()-items[num-1].getPrice()); // 유저 머니 차감
            user.setItem(items[num-1]); // 유저 아이템 장착
            return true;
        }
    }
}
