
import java.util.Scanner;
public class currencyconversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency in INR");
        float a = sc.nextFloat();
        float b = a/83.29f;
        System.out.println("Currency in USD "+b);
    }
}
