import java.util.Scanner;
public class VoteSD {
    public static void getVote(int n){
        if (n>= 18){
            System.out.print(" Eligible ");
        } else
            System.out.println("Not Eligible As The Age isn't Pass 18");


    }
    public static void main(String[] args) {
        System.out.print("Enter the Age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getVote(n);

    }

}
