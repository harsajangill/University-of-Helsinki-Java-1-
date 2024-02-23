import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
 

public class ExerciseManagementTest {

    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning(){
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

}
