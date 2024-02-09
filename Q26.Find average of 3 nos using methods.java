import java.util.Scanner;
public class AvrageSD {
    int avg(int a, int b, int c){
        int ans = (a+b+c)/3;
        return ans;
    }

    public static void main(String[] args) {
        AvrageSD obj = new AvrageSD();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of 3 nos is: ");
       int ans = obj.avg(a,b,c);
        System.out.println(ans);

    }
}
