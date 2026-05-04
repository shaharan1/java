package entity;

public class Student {

    private int roll;
    private String name;
    private String subject;
    private String marks;
    private String department;

    public Student() {
    }

    public Student(int roll, String name, String subject, String marks, String department) {
        this.roll = roll;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.department = department;
    }

    public Student(String name, String subject, String marks, String department) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.department = department;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   
    
}
