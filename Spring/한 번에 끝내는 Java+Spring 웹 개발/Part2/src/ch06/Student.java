package ch06;

public class Student {
    public int studentId;
    public String studentName;
    public int grade;

    public Student() {}
    public Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
