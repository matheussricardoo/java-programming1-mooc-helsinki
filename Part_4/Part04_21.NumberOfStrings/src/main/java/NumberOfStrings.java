
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            String text = scanner.nextLine();

            if(text.contains("end")){
                break;
            }

            sum++;
        }

        System.out.println(sum);
    }
}
