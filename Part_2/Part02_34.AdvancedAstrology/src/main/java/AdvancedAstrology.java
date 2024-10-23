
public class AdvancedAstrology {

    public static void printStars(int number) {
        int n = 0;
        while (n < number) {
            System.out.print("*");
            n++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int n = 0;
        while (n < number){
            System.out.print(" ");
            n++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < size+1; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }


    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
