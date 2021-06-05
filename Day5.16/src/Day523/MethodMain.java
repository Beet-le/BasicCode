package Day523;

 class MethodMain {
    public static void main(String[] args) {
            int[] array={123,12,456,76535,342};
            int max=getMax(array);
             System.out.println("最大"+max);
            methodMin one=new methodMin();
            one.getArray();


    }
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

}
