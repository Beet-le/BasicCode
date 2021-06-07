package DAY606;

public class StaticWrit {
    static {
        System.out.println("静态代码块执行");
    }
    public StaticWrit(){
        System.out.println("构造方法执行");
    }
}
