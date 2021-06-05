package Day523;

public class methodMin {
    int[]array={1,2,3,4,5,2,1,123,13};
    int min=array[0];
    public int[] getArray() {
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("最小"+min);
        return array;
    }
}
