package Homework;

public class Class {
    public String className;
    public String subject;
    public int numberofStudent;
    public int numberofTeacher;

    public Class(String className, String subject, int numberofStudent, int numberofTeacher) {
        this.className = className;
        this.subject = subject;
        this.numberofStudent = numberofStudent;
        this.numberofTeacher = numberofTeacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberofStudent() {
        return numberofStudent;
    }

    public void setNumberofStudent(int numberofStudent) {
        this.numberofStudent = numberofStudent;
    }

    public int getNumberofTeacher() {
        return numberofTeacher;
    }

    public void setNumberofTeacher(int numberofTeacher) {
        this.numberofTeacher = numberofTeacher;
    }
}
