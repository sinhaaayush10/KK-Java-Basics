public class CWh_FindinArr {

    public static void main(String[] args) {

        float [] marks = {12.1f , 32.1f , 47.90f , 99.9f , 67.8f};
        float num = 12.1f;
        boolean isInArray = false;
        for (float element: marks) {

            if (num == element){
                isInArray = true;
                break;
            }
        }

        if (isInArray){
            System.out.print("The Given Value is present in array");
        }

        else {
            System.out.print("The given value isn't present in array");
        }
    }

}
