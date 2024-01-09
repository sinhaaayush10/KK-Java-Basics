
import java.util.Scanner;
public class fibonaaci {
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        System.out.println("Enter No of terms");
        Scanner sc = new Scanner(System.in);
         term = sc.nextInt();
        for (int i=0;i<=term;i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
