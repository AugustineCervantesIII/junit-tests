import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup() throws Exception {
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student ness = new Student(1L, "Ness");
        ness.addGrade(90);

        //kirby is the best fighter
        Student kirby = new Student(2L, "Kirby");
        kirby.addGrade(100);

        //fox is alright
        Student fox = new Student(3L, "Fox");
        fox.addGrade(80);

        //pikachu is good
        Student pikachu = new Student(4L, "Pikachu");
        pikachu.addGrade(90);

        cohortWithOne.addStudent(ness);
        cohortWithMany.addStudent(kirby);
        cohortWithMany.addStudent(fox);
        cohortWithMany.addStudent(pikachu);
    }

    @Test
    public void testAddStudentGetStudent() {
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(3, cohortWithMany.getStudents().size());
    }

    @Test
    public void testAverage() {
        assertEquals(90, cohortWithOne.getCohortAverage(), 0);
        assertEquals(90, cohortWithMany.getCohortAverage(), 0);
    }

}
