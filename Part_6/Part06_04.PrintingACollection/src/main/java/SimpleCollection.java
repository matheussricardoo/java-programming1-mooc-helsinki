
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int size;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
        this.size++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String elementWord = (this.elements.size() == 1) ? "element" : "elements";

        StringBuilder result = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + " " + elementWord + ":\n");

        for (String element : this.elements) {
            result.append(element).append("\n");
        }

        return result.toString().trim();
    }
}