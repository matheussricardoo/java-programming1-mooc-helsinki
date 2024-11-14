import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {3, 1, 5, 99, 3, 12};
        String[] strArray = {"banana", "apple", "cherry", "date"};

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 5, 99, 3, 12));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));

        sort(intArray);
        System.out.println("Sorted integer array: " + Arrays.toString(intArray));

        sort(strArray);
        System.out.println("Sorted string array: " + Arrays.toString(strArray));

        sortIntegers(intList);
        System.out.println("Sorted integer list: " + intList);

        sortStrings(strList);
        System.out.println("Sorted string list: " + strList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
