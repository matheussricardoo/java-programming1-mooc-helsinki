import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        if (points.isEmpty()) {
            System.out.println("No valid points entered.");
            return;
        }

        double totalAverage = calculateAverage(points);
        double passingAverage = calculatePassingAverage(points);
        double passPercentage = calculatePassPercentage(points);
        int[] gradeDistribution = calculateGradeDistribution(points);

        System.out.println("Point average (all): " + totalAverage);
        if (passingAverage >= 0) {
            System.out.println("Point average (passing): " + passingAverage);
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + passPercentage);
        printGradeDistribution(gradeDistribution);
    }

    public static double calculateAverage(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }

    public static double calculatePassingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count == 0) {
            return -1; 
        }
        return (double) sum / count;
    }

    public static double calculatePassPercentage(ArrayList<Integer> points) {
        int passingCount = 0;
        for (int point : points) {
            if (point >= 50) {
                passingCount++;
            }
        }
        return 100.0 * passingCount / points.size();
    }

    public static int[] calculateGradeDistribution(ArrayList<Integer> points) {
        int[] distribution = new int[6];
        for (int point : points) {
            if (point < 50) {
                distribution[0]++;
            } else if (point < 60) {
                distribution[1]++;
            } else if (point < 70) {
                distribution[2]++;
            } else if (point < 80) {
                distribution[3]++;
            } else if (point < 90) {
                distribution[4]++;
            } else {
                distribution[5]++;
            }
        }
        return distribution;
    }

    public static void printGradeDistribution(int[] grades) {
        System.out.println("Grade distribution:");
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
