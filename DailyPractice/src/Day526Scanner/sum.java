package Day526Scanner;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        System.out.println("请输入一个数A：");
        int b=sca.nextInt();
        System.out.println("请输入一个数B：");
        int a=sca.nextInt();

        int Sum=a+b;
        System.out.println("两数之和为："+Sum);
    }
}
