import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int wins = 0;
        int loses = 0;

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner readerFile = new Scanner(Paths.get(file))) {
            while (readerFile.hasNextLine()) {
                String row = readerFile.nextLine();
                String[] listOfGames = row.split(",");

                if (row.contains(team)) {
                    count++;

                    int teamScore = 0;
                    int opponentScore = 0;

                    if (listOfGames[0].equals(team)) {
                        teamScore = Integer.parseInt(listOfGames[2]);
                        opponentScore = Integer.parseInt(listOfGames[3]);
                    } else {
                        teamScore = Integer.parseInt(listOfGames[3]);
                        opponentScore = Integer.parseInt(listOfGames[2]);
                    }

                    if (teamScore > opponentScore) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }

            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
