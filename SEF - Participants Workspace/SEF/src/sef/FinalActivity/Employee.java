package sef.FinalActivity;

import sef.FinalActivity.Person;

public class Employee extends Person {
    private String fName;
    private String  jobTitle;
    private String company;
    private double  salary;
    private int age;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age, String jobTitle, double salary, String company) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.company = company;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }


    public void setJobTitle(String jobTitile) {
        this.jobTitle = jobTitile;
    }

    public String introduce() {
        return "My name is " + fName + "I am " + age + " years old and I work as " + jobTitle + " in " + company;
    }


}

