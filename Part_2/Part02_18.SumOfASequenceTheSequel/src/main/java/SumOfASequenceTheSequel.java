
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.print("First number? ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int y = Integer.valueOf(scanner.nextLine());
        for (int i = x; i < y+1; i++){
            soma += i;
        }
        System.out.println("The sum is: " + soma);
    }
}
