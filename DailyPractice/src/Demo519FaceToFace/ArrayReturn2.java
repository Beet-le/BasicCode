package Demo519FaceToFace;

public class ArrayReturn2 {
    public static void main(String[] args) {
//        two(1,4,56);
        int[] oneresule=one(12,32,43);//赋值调用
        System.out.println("地址值"+oneresule);//访问数组地址
        System.out.println("avg等于"+oneresule[1]);//赋值调用
        two(1,1,1);//单独调用
       /* int[] tworesul=two(232,1312,4214);
        System.out.println("sum等于"+tworesul[0]);*/
    }
    public static  int[] one(int a,int b ,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int[] arrayA=new int[2];
        arrayA[0]=sum;
        arrayA[1]=avg;
        return arrayA;
    }//两种写法
    public static  int[] two(int a,int b ,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int[] arrayB={sum,avg};
        arrayB[0]=sum;
        arrayB[1]=avg;
        System.out.println(arrayB[0]);
        return arrayB;
    }

}
