package Day610ExtenFiled;

public class Zi extends Fu{
    int num=20;
    public void method(){
        int num=30;
        System.out.println(num);//30
        System.out.println(this.num);//20     本类  this关键字
        System.out.println(super.num);//10    父类    super关键字
    }
}
