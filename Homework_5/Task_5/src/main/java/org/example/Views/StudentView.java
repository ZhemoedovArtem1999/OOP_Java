package org.example.Views;


import org.example.Models.Student;

public class StudentView implements View<Student> {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
}
