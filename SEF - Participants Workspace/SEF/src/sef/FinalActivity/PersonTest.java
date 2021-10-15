package sef.FinalActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testPerson() {
        Person test1 = new Person("Test1234", 255);
        assertEquals("Test1234", test1.getName());
        assertEquals(255, test1.getAge());

        try {
            test1.setName("Ivan");
        } catch (Exception e) {
            fail();
        }
        assertEquals("Ivan", test1.getName());

        test1.setAge(25);
        assertEquals(25, test1.getAge());

        assertEquals("My name is Ivan and I am 25 years old", test1.introduce());

        try {
            test1.setName("Ivan1337");
        } catch (Exception e) {
            assertEquals("First name contains digits", e.getMessage());
        }
        assertFalse("Ivan1337 is not set?", test1.getName().equals("Ivan1337"));

        try {
            test1.setName("TheTerribleTerrible228");
        } catch (Exception e) {
            assertEquals("First name contains digits", e.getMessage());
        }
    }
}

