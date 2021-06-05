package Day525GouZaoFangFa;

public class GouZaoFangFaMain {
    public static void main(String[] args) {
        GouZaoFangFa GZFF=new GouZaoFangFa();//调用 无参数构造方法
        GouZaoFangFa gzff=new GouZaoFangFa("李奶奶",18);//调用 全参数构造方法
        System.out.println("姓名:"+gzff.getName()+",年龄"+gzff.getAge());
//        如果需要改变对象中的内容
        gzff.setAge(21);
        System.out.println("姓名:"+gzff.getName()+",年龄"+gzff.getAge());

    }

}
