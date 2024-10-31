
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String row = scanner.nextLine();

            if(row.contains("end")){
                break;
            }

            int number = Integer.valueOf(row);
            double mult = Math.pow(number , 3);
            System.out.println((int)mult);
        }
    }
}
