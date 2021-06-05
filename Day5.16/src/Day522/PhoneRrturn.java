package Day522;

public class PhoneRrturn {
    public static void main(String[] args) {
       Phone two=getPhone();//赋值调用
        System.out.println(two.color);//小晓
        System.out.println(two.brand);//土豪金
        System.out.println(two.price);//123
    }
    public static Phone getPhone(){
        Phone one =new Phone();
        one.brand="小晓";
        one.color="土豪金";
        one.price=123;
        System.out.println("买手机啦");
        return one;
    }
}