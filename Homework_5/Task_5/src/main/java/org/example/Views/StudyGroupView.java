package org.example.Views;

import org.example.Models.Student;
import org.example.Models.StudyGroup;

public class StudyGroupView implements  View<StudyGroup>{
    View teacherView = new TeacherView();
    View studentView = new StudentView();
    @Override
    public void printOnConsole(StudyGroup item) {
        System.out.println("StudyGroup:{\n");
        teacherView.printOnConsole(item.getTeacher());
        for (Student student: item.getStudents()) {
            studentView.printOnConsole(student);
        }
        System.out.println("}\n\n");

    }
}
