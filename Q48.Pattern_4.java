public class pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        int j=0;
        for (i=1; i<=n; i++){
            for(j=1; j<=i; j++)
                System.out.print(i+" ");
            System.out.println("");
        }
        System.out.println("");
    }
}
