//import java.lang.reflect.Array;

public class Swaps {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,1,0,1,0};
        int count = 0;
        int i = 0;
        int j = 1;
        int temp;
        while (j < arr.length && i < arr.length){
            if (arr[j] == 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                count++;
            }
        i++;
        j++;
        }
        System.out.println(count);
    }
}
