package Demo519FaceToFace;
/*
属性：
    姓名
    年龄
行为：
    吃饭
    睡觉
    学习
对应到java类中：
成员变量（属性）：
    String name（姓名）
    int age（年龄）
成员方法（行为）：
public void eat（）{}吃饭
public void Sleep（）{}睡觉
public void study（）{}学习
*/
/*
注意：
   1. 成员变量是直接定义在类当中的，在方法外面
   2.方法无static关键字
 */
public class Stduent {//类
    //成员变量
    String name;//null
    int age;//0

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public  void  sleep(){
        System.out.println("睡觉");
    }
    public  void study(){
        System.out.println("学习");
    }
}
