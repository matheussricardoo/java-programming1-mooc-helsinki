
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter(7);
        Counter counter2 = new Counter ();

        counter.increase();
        counter2.increase();
        counter.decrease();
        counter2.decrease();
        counter.increase(5);
        counter2.increase(5);
        counter.decrease(5);
        counter2.decrease(5);

    }
}
