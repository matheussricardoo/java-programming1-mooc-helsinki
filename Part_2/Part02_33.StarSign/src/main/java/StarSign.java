
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int n = 0;
        while (n < number) {
            System.out.print("*");
            n++;
        }
        System.out.println();
    }


    public static void printSquare(int size) {
        int n = 0;

        while (n < size) {
            printStars(size);
            n++;
        }
    }

    public static void printRectangle(int width, int height) {
        int n = 1;
        while (true) {
            if (n == width) {
                printStars(width);
                break;
            } else {
                n++;
            }
        }
        int y = 1;
        while (y < height) {
            printStars(width);
            System.out.println("");
            y++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < size + 1; i++) {
            printStars(i);
        }
    }
}
