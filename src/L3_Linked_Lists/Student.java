package L3_Linked_Lists;

/*
* Student class
* Use to store the name and marks of student
* */

public class Student {
    private String name;
    private double marks;

    //Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
