package Day528ArrayListClass;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {

        ArrayList<Student> list=new ArrayList<>();

        Student one=new Student("李磊",20);
        Student two=new Student("韩梅梅",20);
        Student three=new Student("山姆",20);
        Student four=new Student("白嫖怪",20);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
//        遍历集合
        for (int i = 0; i < list.size(); i++) {
           Student stu= list.get(i);//
            System.out.println("姓名:"+stu.getName()+"  年龄:"+stu.getAge());
        }

    }
}
