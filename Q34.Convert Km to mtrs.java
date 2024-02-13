import java.util.Scanner;
public class CWHKmToMtrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter KM: ");
        float x = sc.nextFloat();
        float ans = x*1000;
        System.out.print(""+ans);
        System.out.print(" mtrs");

    }
}
