
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int soma = 0;
        while (true) {
            String input = scanner.nextLine();
            soma += 1;
            if (input.equals("")) {

                break;
            }
            list.add(input);
        } System.out.print(list.get(soma-2));

    }
}
