package Day523;

public class DemoDifference {


        String name;//成员变量；=null


        public void methodA(){
            int num=123;//局部变量
            System.out.println(num);
            System.out.println(name);//null
        }
        public void methodB(int a,int b){
            int sun;
            sun=a+b;
//            int number=123;//局部变量
            System.out.println(sun);
        }

}
