
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = scanner.nextInt();
        System.out.print("Upper bound? ");
        int upperBound = scanner.nextInt();

        int count = 0;


        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextInt()) {
                int number = readFile.nextInt();

                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        }System.out.println("Numbers: " + count);

    }
}
