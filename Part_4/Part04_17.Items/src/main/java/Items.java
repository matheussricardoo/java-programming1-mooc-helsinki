import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String op = scanner.nextLine();
            if (op.isEmpty()) {
                break;
            }

            items.add(new Item(op));
        }

        System.out.println();


        for (Item item : items) {
            System.out.println(item);
        }
    }
}
