import java.util.Scanner;
public class FactorialSD {
    public static void printFactorial(int n) {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter A No : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);

    }
}
