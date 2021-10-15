package sef.FinalActivity;

import sef.FinalActivity.Person;

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, String schoolName) {
        super(name);
        this.schoolName = schoolName;
    }

    public Student(String name, int age,String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String introduce() {
        return "I am studying in university of" + schoolName;
    }
}
