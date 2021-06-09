package Day608Inherits;
//main方法区
public class Demo01Extend {
    public static void main(String[] args) {
        Teacher th=new Teacher();
        th.method();
        th.age=12;
        System.out.println(th.age);
        System.out.println(th.name);
        Asststant as=new Asststant();
        as.method();
    }
}
