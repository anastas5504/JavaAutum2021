package sef.FinalActivity;

public class Person {
    private String name;
    private int age;

    public static void checkName (String name) throws Exception {
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Name contains digits");
            }
        }
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        try {
            checkName(newName);
            this.name = newName;

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String introduce(){
        return "My name is " + name + "and I am" + age + "years old";
    }
}
