package Demo517Array;
/*数组元素反转
本来：1，2，3，4,5,6
后来：6,5,4，3，2，1
*/
public class DemoArrayReverse518 {
    public static void main(String[] args) {
        int[]arrayA={1,2,3,4,5,6};
        //遍历数组
        /*初始化：int min=0,max=arrayA.length-1
        条件判断：min<max
        步进表达：min++，max--
        循环体：用第三变量交换
        */
        for (int min=0,max=arrayA.length-1;min<max;min++,max--) {
            int temp=arrayA[min];
            arrayA[min]=arrayA[max];
            arrayA[max]=temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
        }

    }
}
