import java.math.RoundingMode;
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> peoplies;


    public Room() {
        this.peoplies = new ArrayList<>();
    }

    public void add(Person person) {
        this.peoplies.add(person);
    }

    public boolean isEmpty(){
        return this.peoplies.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.peoplies;
    }

    public Person shortest(){
        if(peoplies.isEmpty()){
            return null;
        }

        Person shortest = peoplies.get(0);

        for (Person p : this.peoplies) {
            if(p.getHeight() < shortest.getHeight() ){
                shortest = p;
            }
        }
        return shortest;
    }

    public Person take(){
        if(peoplies.isEmpty()){
            return null;
        }

        Person shortest = peoplies.get(0);

        for (Person p : this.peoplies) {
            if(p.getHeight() < shortest.getHeight() ){
                shortest = p;
            }
        }

        peoplies.remove(shortest);
        return shortest;

    }

}
