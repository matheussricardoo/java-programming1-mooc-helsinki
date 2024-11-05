public class Gift {

    private String name;
    private int Weight;

    public Gift(String name, int kg) {
        this.name = name;
        this.Weight = kg;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return Weight;
    }

    public String toString() {
        return name + " (" + Weight + " kg)";
    }
}
