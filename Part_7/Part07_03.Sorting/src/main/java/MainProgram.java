import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // Testing the code with a sample array
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Original array: " + Arrays.toString(numbers));
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println("Starting sort: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = indexOfSmallestFrom(array, i);
            swap(array, i, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
