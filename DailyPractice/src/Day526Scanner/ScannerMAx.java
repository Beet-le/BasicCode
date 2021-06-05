package Day526Scanner;

import java.util.Scanner;
//3个数求最大
public class ScannerMAx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第1个数字：");
        int a= sc.nextInt();
        System.out.println("请输入第2个数字：");
        int b= sc.nextInt();
        System.out.println("请输入第3个数字：");
        int c= sc.nextInt();
        int ma=maint(a,b,c);
        System.out.println("最大值为："+maint(a,b,c));
        System.out.println("=============================");
        System.out.println("最大值为："+ma);
    }
    public static int maint(int a,int b,int c){
         int temp=a>b?a:b;
         int max=temp>c?temp:c;

         return max;
    }
}

