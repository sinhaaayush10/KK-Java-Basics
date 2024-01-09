import java.util.Scanner;
public class oddeven{
  public static void main(String[] args) {
    int number,reminder;
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    scan.close();

  reminder = number%2;

  if (reminder == 0)
    System.out.println(number+ "is an even number");
    else
    System.out.println(number+ "is an odd Number");
  }
}
