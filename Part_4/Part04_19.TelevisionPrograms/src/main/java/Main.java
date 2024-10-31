import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String Name = scanner.nextLine();

            if (Name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int Duration = scanner.nextInt();
            scanner.nextLine();

            programs.add(new TelevisionProgram(Name, Duration));
        }
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int maximumDuration = scanner.nextInt();
        for (TelevisionProgram programa : programs) {
            if (programa.getDuration() <= maximumDuration) {
                System.out.println(programa);
            }
        }


    }
}
