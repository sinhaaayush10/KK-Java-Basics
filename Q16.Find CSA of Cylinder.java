import java.util.Scanner;

public class csacylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius(r): ");
        float r = sc.nextFloat();
        System.out.println("Enter The Height(h): ");
        float h = sc.nextFloat();

        float area = 2 * 3.14f * r*h;

        System.out.print("The CSA of Cylinder is "+area);
        System.out.println("cm sq.");

    }
}

