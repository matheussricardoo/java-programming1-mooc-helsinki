
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner readerFile = new Scanner(Paths.get(file))) {
            while (readerFile.hasNextLine()) {
                String row = readerFile.nextLine();
                String[] list = row.split(",");
                System.out.println(list[0] + ",age: " + list[1] + " years");

            }

        }
    }
}
