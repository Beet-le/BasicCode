package Day611Override;
//定义一个新手机
public class NewPhone extends Phone {
    @Override
    public void show() {
//        System.out.println("显示号码");
        super.show();//把父类的方法拿过来重复利用
        //再来添加
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
