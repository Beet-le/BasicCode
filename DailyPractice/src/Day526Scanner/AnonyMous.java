package Day526Scanner;

//import Day524GetterSitter.Person;

import java.util.Scanner;

//匿名的方式
public class AnonyMous {
    public static void main(String[] args) {
//
//        System.out.println("=================");
//
        System.out.println("请输入一个数字");
//
//        int num =new Scanner(System.in).nextInt();
//        System.out.println("输入的是:"+num);
//        metholdPream(new Scanner(System.in));
        Scanner sc =  metholdreture();
        int num=sc.nextInt();
        System.out.println("输入的是:"+num);
    }
    public static void metholdPream(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是:"+num);
    }
    public static Scanner metholdreture(){
//        Scanner sc=new Scanner(System.in);
//        sc.nextInt();
        return new Scanner(System.in);
    }
}
