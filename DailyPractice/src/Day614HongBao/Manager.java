package Day614HongBao;

import java.util.ArrayList;

//群主
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先 需要一个集合,用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看看群组多少钱;
        int leftMoney = super.getMoney();//群主当前的余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;  //返回空集合
        }
        // 扣钱,群主钱包扣钱. 重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包需要平均拆分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数,也就是零头
        //除不开的放进最后一个红包;
        //把红包一个一个放到集合当中

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
