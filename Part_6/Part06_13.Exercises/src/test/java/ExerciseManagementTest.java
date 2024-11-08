import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
public class ExerciseManagementTest {
    private ExerciseManagement management;
    @Before

    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtTheBeginning(){
        assertEquals(0,management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("this test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("this test");
        assertTrue( management.exerciseList().contains("this test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("this test");
        management.markAsCompleted("this test");
        assertTrue(management.isCompleted("this test"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("this test");
        management.markAsCompleted("this test");
        assertFalse(management.isCompleted("not this test"));
    }
}