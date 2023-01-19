package ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentTest = new Student(19, "Test Student", 1);

        System.out.println(studentTest.studentId);
        System.out.println(studentTest.studentName);
        System.out.println(studentTest.grade);
    }
}
