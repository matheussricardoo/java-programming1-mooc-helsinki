
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error

        ArrayList<String> lines = null;

        lines.add("This will cause a NullPointerException");
    }
}

