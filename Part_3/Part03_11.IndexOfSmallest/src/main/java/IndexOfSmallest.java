
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int number = scanner.nextInt();
            if (number == 9999){
                break;
            }
            numbers.add(number);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            int x = numbers.get(i);
            if (smallest > x){
                smallest = x;
            }
        }

        System.out.println("");
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
