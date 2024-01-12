import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        System.out.print("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1;i<=num; i++){

            fact = fact*i;
        }
        System.out.print("The Factorial of "+num);
        System.out.println(" is "+fact);
    }
}
