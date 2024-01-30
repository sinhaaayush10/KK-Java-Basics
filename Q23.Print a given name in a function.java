import java.util.Scanner;
public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.print("Enter Name:-");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); //call kiya function ko
    }
}
