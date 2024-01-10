import java.util.Scanner;
public class fruitndfreature {
    public static void main(String[] args) {
        System.out.print("Enter the fruit name :- ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch(fruit){
            case "Mango":
                System.out.println("The King Of Fruits.");
                break;
            case "Orange":
                System.out.println("A fruit which contains vitamin C.");
                break;
            case "Apple":
                System.out.println("An apple a day keeps doctors away.");
                break;
            case "Kiwi":
                System.out.println("A fruit from New Zealand.");
                break;
            case "Dragon Fruit":
                System.out.println("A pink fruit with white pulp inside.");
                break;
            default:
                System.out.println("INVALID FRUIT.");
        }

    }

}
