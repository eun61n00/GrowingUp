package ch24;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student() {}
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScore();
        }

        System.out.println("Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", subjectList=" + subjectList + '\'' +
                ", totalScore=" + total +
                '}');
    }
}
