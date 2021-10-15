package sef.FinalActivity;

import sef.FinalActivity.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testStudents() {
        Student test1 = new Student("John", "Oxford");
        assertEquals("John", test1.getName());
        assertEquals("Oxford", test1.getSchoolName());

        test1.setName("Elvis");
        assertEquals("Elvis", test1.getName());

        test1.setSchoolName("MIT");
        assertEquals("MIT", test1.getSchoolName());


        assertEquals("I am studying in university of MIT", test1.introduce());
    }
}
