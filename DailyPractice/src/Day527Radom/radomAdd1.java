package Day527Radom;
import java.util.Random;
public class radomAdd1 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int n=10;
            int result=r.nextInt(n)+1;
            System.out.println("随机数为："+result);
        }
    }
}
