package Day531ArrayListPrint;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistRandom {
    public static void main(String[] args) {
        ArrayList<Integer> Biglist=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            Biglist.add(num);
        }
        ArrayList<Integer> Small=getSamllList(Biglist);
        System.out.println(Small);
        System.out.println("偶数总共有"+Small.size());
        for (int i = 0; i < Small.size(); i++) {
            System.out.println(Small.get(i));
        }
    }
//    接收大集合的参数，返回小结果
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> BigList){
//        创建一个小集合，用来装偶数
        ArrayList<Integer> SmallList=new ArrayList<Integer>();
        for (int i = 0; i < BigList.size(); i++) {
            int num=BigList.get(i);
            if (num%2==0){
                SmallList.add(num);
            }
        }
        return SmallList;
    }
}
