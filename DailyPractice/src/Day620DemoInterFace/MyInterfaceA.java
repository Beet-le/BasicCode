package Day620DemoInterFace;

public interface MyInterfaceA {
        public abstract void methodA();
        public abstract void methodABS();
        public default void methodDefault(){
                System.out.println("默认方法AAA");
        }
}
