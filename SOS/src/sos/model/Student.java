package sos.model;

public class Student {

    int stuId;
    String stuName;
    String stuGmail;
    String stuCell;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuGmail, String stuCell) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGmail = stuGmail;
        this.stuCell = stuCell;
    }

    public Student(String stuName, String stuGmail, String stuCell) {
        this.stuName = stuName;
        this.stuGmail = stuGmail;
        this.stuCell = stuCell;
    }

}
