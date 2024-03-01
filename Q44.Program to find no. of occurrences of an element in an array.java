import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome To Array Occurrences\n");
        System.out.print("Please Enter total no of element:");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.print("Your element was found "+ occurrences+ " times in the array");

    }
    public static int noOfOccurrences(int[] numArr,int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if (numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
