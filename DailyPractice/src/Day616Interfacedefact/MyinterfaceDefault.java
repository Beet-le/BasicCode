package Day616Interfacedefact;

public interface MyinterfaceDefault {
    //這是一个抽象方法
    public abstract void methodABS();

//    public abstract void methodABS2();

    public default void methodDefault() {
        System.out.println("新添加的默认方法");
    }
}
