package Day522;

class Phone {
    String brand;//品牌
    double price;//价格
    String color;//颜色
    public void call(String who){
        System.out.println("给"+who+"谁打电话");
    }
    public void massage(){
        System.out.println("群发短信");
    }

}