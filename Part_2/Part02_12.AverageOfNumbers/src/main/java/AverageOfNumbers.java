
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double qtdNum = 0;

        while(true){
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0 ){
                break;
            } else {
                qtdNum += 1;
                soma += number;

            }
        }
        double average = soma / qtdNum;
        System.out.println("Average of the numbers: " + average);
    }
}
