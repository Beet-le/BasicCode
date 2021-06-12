package Day611ThisExtence;

public class Zi extends Fu{
    int num=20;
    public Zi(){
        this(10);

    }
    public Zi(int num) {
        this(20,13);
    }
    public Zi(int num ,int s){

    }
    public void showNum(){
        int num=10;
        System.out.println(num);
        System.out.println(super.num);
        System.out.println(this.num);
    }
    public void methodA(){

        System.out.println("AAAAAA");
    }
    public void methodB(){

        System.out.println("BBBBBBB");
    }

    @Override
    public void methodFu() {
        super.methodFu();
        int b=230;
    }
}
