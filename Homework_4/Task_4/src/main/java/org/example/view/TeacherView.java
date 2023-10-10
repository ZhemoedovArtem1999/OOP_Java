package org.example.view;

import org.example.data.Student;
import org.example.data.StudentGroup;
import org.example.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            System.out.println(user.toString());
        }
    }

}
