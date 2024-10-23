

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int x) {
        for (int i = 1; i < x + 1; i++) {
            System.out.println(i);
        }
    }
}
