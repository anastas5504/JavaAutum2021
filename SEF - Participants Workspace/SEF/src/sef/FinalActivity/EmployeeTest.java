package sef.FinalActivity;
import sef.FinalActivity.Employee;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testEmployeeCreation1() {
        Employee employee = new Employee("Test", 34, "QA");
        assertEquals("Test", employee.getName());
    }

    public void testEmployeeCreationSetName() {
        Employee employee = new Employee("Test", 34, "QA");
        employee.setName("new name");
        assertEquals("new name", employee.getName());
    }

    public void testEmployeeCreation2() {
        Employee employee = new Employee("Test", 34, "QA");
        assertEquals(34, employee.getAge());
    }

    public void testEmployeeCreationSetAge() {
        Employee employee = new Employee("Test", 34, "QA");
        employee.setAge(44);
        assertEquals(44, employee.getAge());
    }

    public void testEmployeeCreation4() {
        Employee employee = new Employee("Test", 34, "QA");
        assertEquals("QA", employee.getJobTitle());
    }

    public void testEmployeeCreationSetJobTitle() {
        Employee employee = new Employee("Test", 34, "QA");
        employee.setJobTitle("accountant");
        assertEquals("accountant", employee.getJobTitle());
    }

    public void testEmployeeCreation5() {
        Employee employee = new Employee("Test", 34, "QA", 3000.00, "Microsoft");
        assertEquals("Microsoft", employee.getCompany());
    }

    public void testEmployeeCreationSetCompany() {
        Employee employee = new Employee("Test", 34, "QA", 3000.00, "Microsoft");
        employee.setCompany("Facebook");
        assertEquals("Facebook", employee.getCompany());
    }

    public void testEmployeeCreation6() {
        Employee employee = new Employee("Test", 34, "QA", 3000.00, "Microsoft");
        assertEquals(3000.00, employee.getSalary());
    }

    public void testEmployeeCreationSetSalary() {
        Employee employee = new Employee("Test", 34, "QA", 3000.00, "Microsoft");
        employee.setSalary(400.00);
        assertEquals(400.00, employee.getSalary());
    }

    public void testThrowException(){

        try {
            testEmployeeCreation1();
            testEmployeeCreationSetName();
            testEmployeeCreation2();
            testEmployeeCreationSetAge();
            testEmployeeCreation4();
            testEmployeeCreationSetJobTitle();
            testEmployeeCreation5();
            testEmployeeCreationSetCompany();
            testEmployeeCreation6();
            testEmployeeCreationSetSalary();
        } catch (Exception e) {
            fail();
        }
        catch (Error e) {
            fail();
        }
    }
}