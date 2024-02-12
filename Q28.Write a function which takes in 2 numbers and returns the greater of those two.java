import java.util.Scanner;
public class GreatestOfTwoSD {
    public static int printGreatest(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd No: ");
        int b = sc.nextInt();
        System.out.print("The Greatest of the two is: ");
        System.out.println(printGreatest(a,b));

    }
}
