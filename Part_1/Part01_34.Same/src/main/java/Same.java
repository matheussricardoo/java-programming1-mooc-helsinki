
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.

        System.out.println("Enter the first string:");
        String phrase = scan.nextLine();
        System.out.println("Enter the second string:");
        String phraseTwo = scan.nextLine();

        if (phrase.equals(phraseTwo)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
