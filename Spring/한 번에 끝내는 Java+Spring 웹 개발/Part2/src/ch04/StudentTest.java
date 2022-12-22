package ch04;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "Lee";
        studentLee.address = "Seoul";

        Student studentKim = new Student();
        studentKim.studentName = "Kim";
        studentKim.address = "Jeju";

        studentLee.introduce();
        studentKim.introduce();
    }
}
