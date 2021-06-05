package Day524GetterSitter;

public class GetterSitterMain {
    public static void main(String[] args) {
        GetterSitter stduent=new GetterSitter();
        stduent.setname("蔡徐坤");
        stduent.setMale(true);
        stduent.setAge(19);
        System.out.println(stduent.getAge());
        System.out.println(stduent.getname());
        System.out.println(stduent.isMale());
    }
}
