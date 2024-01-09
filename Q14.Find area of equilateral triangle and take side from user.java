import java.util.Scanner;
public class areaequilateraltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side : ");
        float side = sc.nextFloat();
        float area = 1.73f/4 * side*side;
        System.out.println("The area of equilateral triangle is "+area);

    }
}
