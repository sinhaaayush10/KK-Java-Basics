import java.util.Scanner;
public class CWHCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks of 3 SUBJECT: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int per = (x+y+z)*100/300;
        float cgpa = (per)/9.5f;
        System.out.print("The CGPA Scored is :- "+cgpa);
        

    }
}
