import java.util.Scanner;
public class areatriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base : ");
        float b = sc.nextFloat();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Height : ");
        float h = scan.nextFloat();

        float area = (b*h)/2f;
        System.out.println("Area Of Triangle is "+area);
    }
}
