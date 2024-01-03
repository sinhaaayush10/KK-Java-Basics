import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal");
        int p = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Time");
        int t = scan.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your rate");
        int r = scanner.nextInt();
        int d;
        d= (p * r * t)/100;
        System.out.println("Simple Interest is Rs. "+d);

    }
}
