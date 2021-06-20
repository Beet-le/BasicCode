package Day620DemoInterFace;

public interface MyInterfaceB {
        public abstract void methodB();
        public abstract void methodABS();
        public default void methodDefault(){
                System.out.println("默认方法BBB");
        }
}
