package Day620DemoInterFace;

public abstract class MyinterFaceAbstrict implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {

    }
    @Override
    public void methodABS() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }
}
