package Day525GouZaoFangFa;

public class ThisMain {
    public static void main(String[] args) {
        This person=new This();
   /*     person.setName("你奶奶");
        System.out.println("叫什么名字："+person.getName());*/
        person.name="小小小";
        person.sayhello("淦");
        System.out.println(person);//地址

    }
}
/*
通过谁调用的谁就是This 地址是一样的
Person和this 地址一样
*/
