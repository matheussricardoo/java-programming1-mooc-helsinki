public class Item {
    private String name;
    private int Weight;

    public Item(String name, int weight) {
        this.name = name;
        this.Weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return Weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.Weight + " kg)";
    }
}
