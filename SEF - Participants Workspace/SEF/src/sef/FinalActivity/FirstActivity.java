package sef.FinalActivity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import sef.FinalActivity.Employee;

public class FirstActivity {
    static int sortDesc(Employee employeeFirst, Employee employeeSecond) {
        return (int) (employeeSecond.getSalary() - employeeFirst.getSalary());
    }

    public static void main(String[] arg) {
        List<Employee> employees = new ArrayList<Employee>();
        Employee john = new Employee("John", 35, "Accountant");
        Employee ann = new Employee("Ann", 28, "Qa engineer");
        Employee sargis = new Employee("Sargis", 26, "Software engineer");

        sargis.setCompany("PicsArt");
        sargis.setSalary(5000.00);

        ann.setCompany("Facebook");
        ann.setSalary(1300.00);

        john.setCompany("Google");
        john.setSalary(3200.00);

        employees.add(john);
        employees.add(ann);
        employees.add(sargis);

        employees.sort(FirstActivity::sortDesc);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee name: " + employees.get(i).getName());
            System.out.println("Employee salary: " + employees.get(i).getSalary());
            System.out.println("--------------------");
        }
    }
}
