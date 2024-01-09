import java.util.Scanner;
public class perimeterhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side: ");
        float side = sc.nextFloat();

        float area = 4*side;

        System.out.println("Area of rhombus is "+area);
    }
}

