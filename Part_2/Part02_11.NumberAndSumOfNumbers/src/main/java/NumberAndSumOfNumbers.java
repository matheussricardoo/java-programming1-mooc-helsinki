
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int qtdNum = 0;

        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else {
                qtdNum += 1;
                soma += number;
            }
        }
        System.out.println("Number of numbers: " + qtdNum);
        System.out.println("Sum of the numbers: " + soma);
    }
}
