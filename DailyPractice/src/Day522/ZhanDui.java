package Day522;

public class ZhanDui {
    public static void main(String[] args) {
      Phone one=new Phone();
        one.brand="Apex";
        one.price=8848;
        one.color="红色";
        one.call("你奶奶");
        one.massage();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("===========");
        Phone two=one;
        foot three=new foot();
        three.type(99.566);
        two.brand="Red Ded";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
}
