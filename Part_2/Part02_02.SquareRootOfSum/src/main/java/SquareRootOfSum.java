
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.valueOf(scanner.nextLine());
        int y = Integer.valueOf(scanner.nextLine());

        int formula = (int) (Math.sqrt(x) + Math.sqrt(y));
        System.out.println(formula);
    }
}
