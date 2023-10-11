package org.example.Views;

import org.example.Models.Teacher;

public class TeacherView implements View<Teacher>{
    @Override
    public void printOnConsole(Teacher item) {
        System.out.println(item.toString());
    }
}
