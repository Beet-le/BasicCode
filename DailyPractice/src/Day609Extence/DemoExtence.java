package Day609Extence;

public class DemoExtence {
    public static void main(String[] args) {
        Fu fu=new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类东西，没有子类内容  10
        Zi zi=new Zi();//创建子类对象
        System.out.println(zi.numFu);//父类子类都能使用  10
        System.out.println(zi.numZi);//20
        System.out.println("================");
        System.out.println(zi.num);
        zi.methodFu();//100
        zi.methodZi();//200
    }
}
