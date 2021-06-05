package Day604;

import java.util.Scanner;

public class StringCont {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String input=sc.next();

        int countUpeer=0;
        int countLower=0;
        int contNumber=0;
        int contOther=0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
             if ('A'<=ch && ch<='Z'){
                 countUpeer++;
             }else if ('a'<=ch && ch<='z'){
                 countLower++;
             }else if ('0'<=ch && ch<='9'){
                 contNumber++;
             }else {
                 contOther++;
             }
        }
        System.out.println("大写字母有多少个:"+countUpeer);
        System.out.println("小写字母有多少个:"+countLower);
        System.out.println("数字有多少个:"+contNumber);
        System.out.println("其他字母有多少个:"+contOther);

    }
}
