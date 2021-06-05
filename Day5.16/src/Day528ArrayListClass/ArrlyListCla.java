package Day528ArrayListClass;

import java.util.ArrayList;

public class ArrlyListCla {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("alex");
        list.add("Ajex");
        list.add("Beetle");
        list.add("Troy");
        System.out.println(list);
        String name=list.get(2);
        System.out.println(name);

        String WhoRemov=list.remove(2);//移走 Beetle 位置在3号位

        System.out.println("谁被移走了:"+WhoRemov);//
        int size=list.size();//长度
        System.out.println(size);//3
    }
}
