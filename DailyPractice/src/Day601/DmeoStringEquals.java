package Day601;

public class DmeoStringEquals {
    public static void main(String[] args) {
        int length = "adadasdadsaasd".length();
        char[] chars = "helloworld".toCharArray();
        byte[] bytes1 = "你奶奶".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println("有没有错误"+bytes1[i]);
        }
        System.out.println("==================");
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==================");
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==================");
        String str1="How are you";
        String replace = str1.replace("yo", "kill");//replace=替换
        System.out.println("替换为"+replace);
        System.out.println(str1);
        String s = "干你奶奶的,你大爷";
        String s1 = s.replace("大爷", "**");
        System.out.println("现在"+s1);

    }
}
