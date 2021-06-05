package Day524GetterSitter;

public class PersonMain {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        System.out.println("=============");
//        person.age=21;
        person.setAge(-20);
        person.name="李奶奶";
        person.show();
    }
}
