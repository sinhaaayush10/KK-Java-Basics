import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        System.out.print("Enter The Consumed Units: ");
        Scanner sc = new Scanner(System.in);
        float unit = sc.nextFloat();

        float total = 7*unit;

        System.out.print("The Consumed Unit "+unit);
        System.out.println(" And total amount is "+total);
    }
}

