import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No");
        int a = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2nd No");
        int b = scan.nextInt();
        if (a>b)
            System.out.println("1st no is greater than 2nd no");
        else
            System.out.println("2nd no is greater than 1st no");
        

    }
}

