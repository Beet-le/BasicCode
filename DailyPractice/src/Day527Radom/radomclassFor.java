package Day527Radom;
import java.util.Random;
public class radomclassFor {
    public static void main(String[] args) {
        Random r=new Random();

        for (int i = 0; i < 100; i++) {
            int num=r.nextInt(10);
            System.out.println("随机数为："+num);
        }
    }
}
