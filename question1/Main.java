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
public class Main {

    public static void main(String[] args) {
        Course course = new Course("JAVA");
        System.out.println("COURSE NAME : " + course.getName());
        for (int i = 0; i < 5; i++) {
            course.registerStudent(new Student("student"+i,"s"+i));
        }
        Student []students = course.getStudents();

        for (int i = 0; i < students.length; i++) {
            System.out.println("STUDENT NAME / ID  : " +students[i].getName()+" / "+students[i].getId());
        }
    }

}

