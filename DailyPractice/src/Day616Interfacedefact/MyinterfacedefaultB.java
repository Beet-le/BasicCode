package Day616Interfacedefact;

public class MyinterfacedefaultB implements MyinterfaceDefault{

    @Override
    public void methodABS() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现B类覆盖重写了默认方法");
    }
}
