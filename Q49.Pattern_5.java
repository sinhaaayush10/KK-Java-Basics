public class pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        int j=0;
        for (i=1; i<=5; i++){
            for(j=1; j<=n-i+1; j++)
                System.out.print(" *");
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
