package Day527Radom;

import java.util.Random;
import java.util.Scanner;

public class radomShuiJiShu {
    public static void main(String[] args) {
        Random r=new Random();
        int randomnum=r.nextInt(100)+1;//1-100
        System.out.println(randomnum);
        System.out.println("输入一个数：");
        while (true){
            Scanner sc=new Scanner(System.in);
            int guessnum= sc.nextInt();
            if(guessnum>randomnum){
                System.out.println("太大了！重新输入");
            }else if(guessnum<randomnum){
                System.out.println("太小了！重新输入");
            } else {
                System.out.println("恭喜你，答对了");
                break;
            }

        }
    }
}
