package Day531ArrayListPrint;

import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("小吵闹");
        list.add("莉莉丝");
        list.add("玛雅");
        list.add("蛋总");
        System.out.println(list);
        printArray(list);
    }
    public static void printArray(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name= list.get(i);
            if(i== list.size()-1){
                System.out.println(name+"}");
            }else {
                System.out.print(name+" @");
            }

        }
    }
}
