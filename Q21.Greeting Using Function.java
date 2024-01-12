public class Stringeg {

    public static void main(String[] args) {
        String personalised = myGreet("Aayush Sinha");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "Kemon Aacho " +name;
        return message;
    }
}
