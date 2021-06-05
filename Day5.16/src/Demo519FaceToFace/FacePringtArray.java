package Demo519FaceToFace;

import java.util.Arrays;
//
public class FacePringtArray {
    public static void main(String[] args) {
        int []Array={1,2,3,4,5,6};
        System.out.print("[");
        //打印【1,2,3,4,5,6,7】
        for (int i = 0; i < Array.length; i++) {//面向过程，自己打代码，强调步骤
            if(i == Array.length-1) {
                System.out.println(Array[i]+"]");
            }
            else {
                System.out.print(Array[i]+", ");
            }
        }
        System.out.println("==================");
        System.out.println(Arrays.toString(Array));//面向对象，找个人帮我做事，javaJdk包含的，强调对象
    }
}
