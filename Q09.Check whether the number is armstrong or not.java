
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        int n,arm=0,rem,c;
        System.out.print("Enter the no: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        c=n;
        while(n>0)
        {
            rem = n%10;
            arm = (rem*rem*rem)+ arm;
            n=n/10;
        }
        if(c==arm)
        System.out.println("The no is Armstrong");
        else
        System.out.println("The no is not Armstrong");
    }
}
