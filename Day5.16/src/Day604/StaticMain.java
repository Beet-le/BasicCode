package Day604;

public class StaticMain {
    public static void main(String[] args) {

        StaticDemo one =new StaticDemo("小吵闹",20);
        one.room="321教室";
        System.out.println("姓名"+one.getName()+"年龄"+one.getAge()+"学号:"+one.getId()+one.room);
        StaticDemo two =new StaticDemo("莉莉丝",21);
        System.out.println("姓名"+two.getName()+"年龄"+two.getAge()+"学号:"+two.getId()+one.room);
    }
}
