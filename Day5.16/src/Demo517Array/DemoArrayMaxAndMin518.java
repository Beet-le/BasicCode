package Demo517Array;
/*数组求最大最小*/
public class DemoArrayMaxAndMin518 {
    public static void main(String[] args) {
        int[] arrayA = {5, 15, 30, 20, 10000};
        int max = arrayA[0];//定义最大为第一个元素，再依次比较。
        int min = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {     //已经定义array中的0号元素
            //如果元素比max大就换
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
        }
        for (int i = 1; i < arrayA.length; i++) {     //已经定义array中的0号元素
            //如果元素比max大就换
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
        }
        System.out.println("最大值为" + max);
        System.out.println("最小值为" + min);
    }
}
