
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int qtdNumber = 0;
        int soma = 0;
        int qtdOdd = 0;
        int qtdEven = 0;
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                qtdNumber += 1;
                soma += x;
            }
            if (x % 2 == 0) {
                qtdEven += 1;
            } else {
                qtdOdd += 1;
            }
        }
        double average = (double) soma / qtdNumber;
        System.out.println("Sum: " + soma);
        System.out.println("Numbers: " + qtdNumber);
        System.out.println("Average: " + average);
        System.out.println("Even: " + qtdEven);
        System.out.println("Odd: " + qtdOdd);
    }
}
