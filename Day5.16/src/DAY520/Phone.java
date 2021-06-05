package DAY520;
/*成员变量：
String brand;品牌
double price :价格
String color:颜色
成员方法：
public void call(String who){}打电话
public void massage(){}发短信
*/
public class Phone {
        String brand;//品牌
        double price;//价格
        String color;//颜色
    public void call(String who){
        System.out.println("给"+who+"谁打电话");
    }
    public void massage(){
        System.out.println("群发短信");
    }

}
