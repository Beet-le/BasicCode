package Day617MyinterfaceaPrivate;

public class MyinterfacePrivateImpl implements MyinterfacePrivate{
    public void methodAnother(){
        //直接访问到了接口中的默认方法，methodCommon错误的
//        methodCommon();
    }
}
