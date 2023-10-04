package org.example.Controllers;

import org.example.Models.*;
import org.example.Services.DataService;
import org.example.Services.StreamService;
import org.example.Services.StudentGroupService;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    //private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        //List<User> userList = dataService.getAll();
        //userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }


    public void createStream(String title, List<StudentGroup> groups){
        streamService.createStreams(title,groups);
    }
    public void createStream(List<Stream> streams){
        streamService.createStreams(streams);
    }

    public void printStreams(){
        System.out.println(streamService.getStreams());
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public  List<Stream> getSortedCountStudentGroupFromStream()
    {
        return  streamService.getSortedByCountStudentGroup();
    }
}