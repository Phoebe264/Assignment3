/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.question1;

/**
 *
 * @author litong
 */
public class Course {
    private String name;
    private int registeredStudentCount;
    private int maxStudents;
    private Student[] numberOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name) {
        this.name = name;
        maxStudents = 10;
        registeredStudentCount = 0;
        numberOfStudents = new Student[maxStudents];
    }

    public Student[] getStudents() {
        Student[] r = new Student[registeredStudentCount];
        for (int i = 0; i < registeredStudentCount; i++) {
            r[i]=numberOfStudents[i];
        }
        return r;
    }

    public boolean isFull() {
        return registeredStudentCount == maxStudents;
    }

    public void registerStudent(Student student) {
        if (registeredStudentCount < maxStudents) {
            numberOfStudents[registeredStudentCount] = student;
            registeredStudentCount++;
        }
    }
}
