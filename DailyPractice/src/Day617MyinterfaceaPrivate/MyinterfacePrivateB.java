package Day617MyinterfaceaPrivate;

public interface MyinterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("静态方法1");
        methodComon();

    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
        methodComon();

    }
    private static void methodComon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }


}
