package Day611Constructor;
/*
    1.子类构造方法中,有默认的隐含"Super() "调用,所以一定是先调用父类在调用子类
    2.子类构造可以通过super()关键字来调用父类构造
    3.super()父类构造的调用必须是子类构造方法的第一句
*/
public class ConstructorMain {
    public static void main(String[] args) {
        Zi zi=new Zi();
    }
}
