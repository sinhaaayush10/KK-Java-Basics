import java.util.Scanner;
public class Sumwithfun {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("The sum of 2 nos is: "+ans);
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter no 2: ");
        int num2 = sc.nextInt();

        int Sumwithfun = num1 + num2;
        return Sumwithfun;
    }
}
