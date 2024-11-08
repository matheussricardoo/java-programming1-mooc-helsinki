import java.util.ArrayList;

public class Hold {
    private int weightMax;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weightMax) {
        this.weightMax = weightMax;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitcaseWeight = suitcase.totalWeight();

        if (currentWeight + suitcaseWeight <= weightMax) {
            suitcases.add(suitcase);
            currentWeight += suitcaseWeight;
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            for (Item item : suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }
}
