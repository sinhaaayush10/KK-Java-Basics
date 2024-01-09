
import java.util.Scanner;
public class reversee {
    public static void main(String[] args) {
        System.out.println("Enter a No.");
        Scanner r = new Scanner(System.in);
        int  n = r.nextInt();
        int ans = 0;
        while(n > 0){
            int rem = n %10;
            n /= 10;
            ans = ans * 10  + rem;
        }
        System.out.println(ans);
    }
}
