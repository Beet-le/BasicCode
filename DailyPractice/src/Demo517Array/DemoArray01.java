package Demo517Array;

public class DemoArray01 {
    public static void main(String[] args) {
        int array[] = {12, 32, 1};//静态初始化
        System.out.println(array[0]);
        int array1[] = new int[3];//动态初始化
        array1[1] = 123;//给第二个位置赋值
        System.out.println(array1[1]);
    }
}
