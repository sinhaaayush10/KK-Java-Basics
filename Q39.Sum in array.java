
public class CWH_array_add {

    public static void main(String[] args) {

        float [] marks = {45.6f,67.8f,63.4f,100.0f};
        float sum = 0;
        for (float element: marks) {

            sum = sum + element;
        }

        System.out.println("The value of is "+sum);
    }
}
