package Demo518Array;

public class ArrayPram {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 0};
        Array(array);
        System.out.println("+++++++++++");
    }

    /*三要素
    返回值类型：自是打印而已，不需要计算，无结果，用void
    方法名称：Arrary
    参数列表：必须给我数组，我才能打印其中元素int[] array
    * */
    public static void Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
