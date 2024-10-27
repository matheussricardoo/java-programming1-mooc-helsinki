
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> listNumbers = new ArrayList<>();

        while(true){
            int numbers = scanner.nextInt();
            if (numbers == -1){
                break;
            }
            listNumbers.add(numbers);
        }

        System.out.println("");

        int soma = 0;
        int contador = 0;

        for (int total: listNumbers){
            soma += total;
            contador += 1;
        }

        double avg = (double) soma / contador;

        System.out.println("Average: " + avg);
        
    }
}
