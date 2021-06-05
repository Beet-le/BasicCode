package Day524GetterSitter;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("叫: "+name+",年龄: "+age);
    }
    public void setAge(int num){
        if(num<100&&num>0){
            age=num;
        }
        else {
            System.out.println("年龄数据错误兄弟！");
        }

    }
}
