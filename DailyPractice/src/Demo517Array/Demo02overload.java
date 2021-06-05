package Demo517Array;
//参数类型不同
//参数个数不同
//参数类型顺序不同
public class Demo02overload {
    public static void main(String[] args) {
//        System.out.println(sum(10,230.5));
//        sum(1,2);
        double sum1;
        double A=1.1234,B=23.1313;
        sum1=A+B+231.13;
        System.out.println(sum1);
        cycle(); //调用循环
    }

    public static double sum(double a, double b) {
        System.out.println("2个数");
        System.out.println(sum(20.1,1.01));
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("3个数");
        return (a + b) / c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("4个数");
        return (a * b / c) + d;
    }
    public static void cycle(){
        for (int i = 0; i < 10; i++) {
            System.out.println("循环"+i);
        }
    }
}
