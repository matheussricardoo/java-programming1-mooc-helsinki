
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number > 0){
                int potencia = (int) Math.pow(number,2);
                System.out.println(potencia);
            } else if (number < 0) {
                System.out.println("Unsuitable number");
            } else{
                break;
            }
        }
    }
}
