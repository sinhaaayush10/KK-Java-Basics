import java.util.Scanner;
public class CWHThreeSome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no:");
        int  b = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.print("The Sum of 3 nos is: "+sum);

    }
}
