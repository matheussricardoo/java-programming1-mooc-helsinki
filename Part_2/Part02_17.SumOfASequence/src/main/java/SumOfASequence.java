
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.print("Last number? ");
        int x = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < x+1;i++){
            soma += i;
        }
        System.out.println("The sum is " + soma);
    }
}
