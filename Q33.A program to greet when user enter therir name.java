import java.util.Scanner;
public class CWHGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Hello "+name);
        System.out.print(", Have a good day!!!");

    }
}
