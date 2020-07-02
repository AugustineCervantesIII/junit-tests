import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    //walkthrough
    @Test
    public void testInitialProperties() {
        Student student = new Student(1L, "John");
        assertEquals(1L, student.getId());
        assertEquals("John", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade() {
        Student student = new Student(1l, "John");
        assertEquals(0, student.getGrades().size());
        student.addGrade(100);
        assertEquals(1, student.getGrades().size());
        assertEquals(100, student.getGrades().get(0), 0);
    }

    @Test
    public void testGetGradeAverage() {
        Student student = new Student(1L, "John");
        student.addGrade(0);
        assertEquals(0, student.getGradeAverage(), 0);
        student.addGrade(100);
        assertEquals(50, student.getGradeAverage(), 0);
    }

    //    @Test
//    public void testStudentOne() {
//        Student jack = new Student(4L, "Jack", 90);
//        Student ryan = null;
//        assertNull(ryan);
//        assertNotNull(jack);
//    }
//
//    @Test
//    public void testStudentInfo() {
//        Student jack = new Student(4L, "Jack",90);
//        assertSame(4L, jack.getId());
//        assertSame("Jack", jack.getName());
//        assertSame(0, jack.getGrades().size());
//    }
//
//    @Test
//    public void testGrade() {
//        Student jack = new Student(4L, "Jack",90);
//        jack.addGrade(90);
//        assertSame(90, jack.getGrades().get(0));
//    }
//
//    @Test
//    public void testAverage() {
//        Student jack = new Student(1L, "Jack",90);
//        jack.addGrade(90);
//        jack.addGrade(80);
//        assertEquals(85, jack.getGradeAverage(), 0);
//    }

}
