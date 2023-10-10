package org.example.controller;

import org.example.data.Teacher;
import org.example.service.TeacherService;
import org.example.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();

    private  final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName,secondName,patronymic,dateOfBirth);
        //teacherView.sendOnConsole(teacherService.getAll());
    }

    public void update(Long id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacherService.update(id, firstName,secondName,patronymic,dateOfBirth);
        //teacherView.sendOnConsole(teacherService.getAll());
    }

    public void delete(Long id)
    {
        teacherService.delete(id);
    }

    public void viewTeachers()
    {
        teacherView.sendOnConsole(teacherService.getAll());
    }


}
