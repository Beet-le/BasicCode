package Day528ArrayListClass;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        ArrayList<Integer> listB=new ArrayList<>();
            listB.add(100);
            listB.add(200);
        System.out.println(listB);
        System.out.println(listB.get(1));
        int Rom= listB.remove(1);
        System.out.println(Rom);
        System.out.println(listB);
    }
}
