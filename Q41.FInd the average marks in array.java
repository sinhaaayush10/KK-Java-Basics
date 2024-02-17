
public class CWH_AVg_in_arr {
    public static void main(String[] args) {
        float[] marks = {99.5f ,97.3f ,93.21f ,90.2f, 96.4f};
        float sum = 0;
        for(float element:marks){
        sum = sum + element/5 ;
        }
        System.out.println("The avg marks is " + sum);
    }

}
