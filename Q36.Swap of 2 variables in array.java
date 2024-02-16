
import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
      swap(arr, 1,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr , int index1 ,  int index2 ){
        int temp = arr[index1];
        arr [index1] = arr[index2];
        arr[index2] = temp;
    }
}
