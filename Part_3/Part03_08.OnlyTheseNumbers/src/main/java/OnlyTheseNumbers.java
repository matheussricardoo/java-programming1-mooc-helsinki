
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From Where?");
        int opcao1 = scanner.nextInt();
        System.out.print("To Where?");
        int opcao2 = scanner.nextInt();
        System.out.println(numbers.get(opcao1));
        System.out.println(numbers.get(opcao2));
    }
}
