package ch04;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void introduce() {
        System.out.println("Hi, I'm " + studentName + ". I live in " + address + ".");
    }
}
