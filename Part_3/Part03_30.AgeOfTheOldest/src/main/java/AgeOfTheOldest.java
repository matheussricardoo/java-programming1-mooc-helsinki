import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] parts = text.split(",");
            int idade = Integer.parseInt(parts[1].trim());

            if (idade > maior) {
                maior = idade;
            }
        }

        System.out.println("Age of the oldest: " + maior);
    }
}
