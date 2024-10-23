import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int qtdNumber = 0;

        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                qtdNumber += 1;
                soma += number;
            }
        }

        if (qtdNumber > 0) {
            double average = soma / qtdNumber;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
