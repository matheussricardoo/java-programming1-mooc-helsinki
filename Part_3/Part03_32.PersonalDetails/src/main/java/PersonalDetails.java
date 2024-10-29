
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int qtdCaracter = 0;
        int maior = 0;
        int qtd = 0;
        String maiorNome= "";
        while(true){
            String text = scanner.nextLine();

            if(text.isEmpty()){
                break;
            }

            String [] words = text.split(",");
            String nome = words[0].trim();
            qtdCaracter = words[0].length();

            qtd += 1;
            soma += Integer.parseInt(words[1]);

            if(qtdCaracter > maior){
                maior = qtdCaracter;
                maiorNome = nome;
            }

        }

        double avg = (double) soma / qtd;
        System.out.println("Longest name: " + maiorNome);
        System.out.println("Average of the birth years: " + avg);
    }
}
