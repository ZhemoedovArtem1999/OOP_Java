package org.example.Controlers;


import org.example.Models.*;
import org.example.Service.DataService;
import org.example.Service.StudyGroupService;
import org.example.Views.ExceptionView;
import org.example.Views.StudentView;
import org.example.Views.StudyGroupView;

import java.util.ArrayList;
import java.util.List;

public class MainControler {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    private final ExceptionView exceptionView = new ExceptionView();

    private  final StudyGroupView studyGroupView = new StudyGroupView();

    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        dataService.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        dataService.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    private  List<Student> getStudents(List<Integer> ids){
        List<Student> students = new ArrayList<>();
        for (int id: ids) {
            var student = dataService.getUserById(Type.STUDENT, id) ;
            if (student != null && student instanceof Student)
                students.add((Student)student);
        }
        return  students;

    }

    private Teacher getTeacher(int id){
        return (Teacher) dataService.getUserById(Type.TEACHER, id);
    }

    public void formingStudyGroup(List<Integer> studentIds, int teacherId){
        List<Student> students = this.getStudents(studentIds);
        Teacher teacher = this.getTeacher(teacherId);
        StudyGroup studyGroup;
        if (students.size() != 0 && teacher != null)
            studyGroup = studyGroupService.formingStudyGroup(teacher, students);
        else {
            exceptionView.printOnConsole("Невозможно создать группу! В группе нет учителя или студентов!!!");
            return;
        }
        studyGroupView.printOnConsole(studyGroup);
    }

    public void getStudyGroupView()
    {
        studyGroupView.printOnConsole(studyGroupService.getStudyGroup());
    }

}
