package Day614HongBao;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============================");
        //群主    总共发20块钱,分成3份
        ArrayList<Integer> redList = manager.send(20, 3);
        //三个普通成员去收红包
        one.recrive(redList);
        two.recrive(redList);
        three.recrive(redList);

        manager.show();//100-20 =80
        //6  ,  6   , 8  随机分给三个人
        one.show();
        two.show();
        three.show();
    }
}
