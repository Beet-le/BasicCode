package Day531String;

public class Demo01StringMian {
    public static void main(String[] args) {
          String str1=new String();
        System.out.println("第一个字符串: "+str1);
        char[] charArray={'a','b','c'};
        String str2=new String(charArray);
        System.out.println("第二个字符串: "+str2);
        byte[] bytArray={97,98,99};
        String str3=new String(bytArray);
        System.out.println("第三个字符串:"+str3);
        String str4="hello";
        System.out.println("第4个字符串:"+str4);

    }
}
