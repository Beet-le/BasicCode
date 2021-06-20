package Day620DemoInterFace;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodABS() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }
}
