import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        String nomeMaisVelho = "";

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] words = text.split(",");
            String nome = words[0].trim();
            int idade = Integer.parseInt(words[1].trim());

            if (idade > maior) {
                maior = idade;
                nomeMaisVelho = nome;
            }
        }

        System.out.println("Name of the oldest: " + nomeMaisVelho);
    }
}
