import java.util.Scanner;
public class areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        float n = sc.nextInt();
        float area = 3.14f*n*n;
        System.out.println("Area Of Circle is "+area);
    }
}
