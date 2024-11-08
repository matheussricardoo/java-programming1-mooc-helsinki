import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> listJokes;

    public JokeManager() {
        this.listJokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        listJokes.add(joke);
    }

    public String drawJoke() {
        if (listJokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(listJokes.size());
            return listJokes.get(index);
        }
    }

    public void printJokes() {
        for (String joke : listJokes) {
            System.out.println(joke);
        }
    }
}


