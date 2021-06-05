package Day526BiaoZhunClass;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("小吵闹");
        stu1.setAge(1999);
        System.out.println("姓名：" + stu1.getName() + "  年龄：" + stu1.getAge());
        System.out.println("============================");
        Student stu2 = new Student("莉莉丝", 2000);
        System.out.println("姓名：" + stu2.getName() + "  年龄：" + stu2.getAge());
        stu2.setAge(20001);
        System.out.println("姓名：" + stu2.getName() + "  年龄：" + stu2.getAge());
        System.out.println(stu2);

    }
}
