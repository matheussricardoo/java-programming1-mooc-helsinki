import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weightMax;

    public Suitcase(int weightMax) {
        this.items = new ArrayList<>();
        this.weightMax = weightMax;
    }

    public void addItem(Item item) {
        int currentWeight = totalWeight();

        if (currentWeight + item.getWeight() <= weightMax) {
            items.add(item);
        }
    }

    public String toString() {
        int totalWeight = totalWeight();

        if (items.size() == 0) {
            return "no items (" + totalWeight + " kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }

        return items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

}
