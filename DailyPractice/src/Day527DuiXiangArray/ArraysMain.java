package Day527DuiXiangArray;
/*
              定义一个数组来储存三个对象
*/

public class ArraysMain {
    public static void main(String[] args) {
//        定义数组
        Person[] Array = new Person[3];
        Person one = new Person("自行车", 20);
        Person two = new Person("小汽车", 21);
        Person three = new Person("马尔扎哈", 22);
//        生成数组
        Array[0] = one;
        Array[1] = two;
        Array[2] = three;
        System.out.println(Array[0]);//地址
        System.out.println(Array[1]);//地址
        System.out.println(Array[2]);//地址
        System.out.println(Array[0].getAge());//年龄age 20
        System.out.println(Array[1].getName());//名字name 小汽车
        System.out.println(Array[2].getName());//名字name 马尔扎哈
    }
}
