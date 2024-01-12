import java.util.Arrays;
public class Arr {
    public static void main(String[] args) {
        int[] arr = {1,3,4,18,20};
        change(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[1] = 45;
    }
}
