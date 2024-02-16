
import java.util.Scanner;
public class SD_Index {
    public static void main(String[] args) {
        System.out.println("Enter the size of arr:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the numbers: ");

        int numbers[] = new int[size];
//        for input:
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("enter no to found:");

        int x = sc.nextInt();
//        for output:

        for (int i = 0; i < numbers.length; i++) {
                       if (numbers[i] == x){
               System.out.print("x found at index: "+i);
           }
        }
    }

}

