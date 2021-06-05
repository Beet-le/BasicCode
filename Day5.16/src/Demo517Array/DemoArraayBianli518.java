package Demo517Array;
//遍历数组
public class DemoArraayBianli518 {
    public static void main(String[] args) {
        int []arrayA={1,2,3,4,5,6,7};

        for (int i = 0; i < 7; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("===================");
        for (int i = 0; i < arrayA.length; i++) {//array.length代替数字
            System.out.println(arrayA[i]);
        }
    }
}
