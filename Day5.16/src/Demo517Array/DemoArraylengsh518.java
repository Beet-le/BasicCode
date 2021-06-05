package Demo517Array;
//数组一旦创建长度不可改变，只能重新定义。
public class DemoArraylengsh518 {
    public static void main(String[] args) {
        int [] arrayA=new int[3];
        int[] arrayB={1,2,3,4,1231,13,45,56,24};
        arrayA[1]=123;
        System.out.println(arrayA[1]);
        System.out.println("数组B的长度"+arrayB.length);//输出数组长度length
        int len=arrayB.length;//输出数组长度length
        System.out.println(len);
    }
}
