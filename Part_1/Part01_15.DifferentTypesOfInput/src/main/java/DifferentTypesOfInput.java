
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String frase = scan.nextLine();
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double number = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean verdadeoufalso = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + frase);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + number);
        System.out.println("You gave the boolean " + verdadeoufalso);
    }
}
