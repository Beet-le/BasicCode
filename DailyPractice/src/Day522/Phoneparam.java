package Day522;

public class Phoneparam {
    public static void main(String[] args) {
        Phone one=new Phone();//赋值调用
        one.brand="苹果";
        one.price=8848;
        one.color="绿色";
        method(one);//传进去的参数其实就是地址值
    }
   public static void method(Phone pream){
       System.out.println(pream.brand);
       System.out.println(pream.price);
       System.out.println(pream.color);

   }
}
