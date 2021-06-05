package Demo519FaceToFace;

/*
通常情况下，一个类不能直接使用，需要根据一个类创建对象，才能使用。
    1.导包
    import 包名称.类名称;
    import Demo519FaceToFace.StudentFaceToFace;
    对应和当前 类 属于同一 包 的情况,可以省略不写
    2.创建 格式
    类名称 对象名 =new 类名称();
    StudentFaceToFace stu=new StudentFaceToFace();
    3.使用 两种情况
    使用成员变量:对象名.成员变量名
    所有成员方法:对象名.成员方法名(参数)
    (想用谁,就用对象名 点. 谁)
    4.
* */

public class StudentFaceToFace {
    public static void main(String[] args) {
        //1.导包
        //2.创建 格式
//类名 对象名=new 类名（）
//        根据StudentFaceToFace类创建了stu对象
        Stduent stu = new Stduent();
        //3.使用成员变量
        //4.成员名+方法名
        stu.name="Beetle";//定义新的名称
        stu.age=22;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.eat();
        stu.study();
        stu.sleep();
    }
}
