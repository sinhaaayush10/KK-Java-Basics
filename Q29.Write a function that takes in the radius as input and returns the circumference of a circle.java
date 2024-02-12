
import java.util.Scanner;
public class CircumferenceSD {
    public static void getCircumference(float n){
        float result = 2*22/7f*n;
        System.out.println(result);
    }
    public static void main(String[] args) {
        System.out.print("Enter The Radius: ");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        System.out.print("The Circumference Of the Circle is: ");
        getCircumference(n);
    }
}
