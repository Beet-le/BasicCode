package Day525GouZaoFangFa;
/*
构造方法
*/
public class GouZaoFangFa {
    //成员变量
    private String name;
    private int age;
//    无参数构造方法执行
    public GouZaoFangFa(){
        System.out.println("无参数构造方法执行啦");
    }
//  重载  全参数构造方法执行
    public GouZaoFangFa(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参数构造方法执行啦");
//        System.out.println(name);
//        System.out.println(age);
    }
//Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

