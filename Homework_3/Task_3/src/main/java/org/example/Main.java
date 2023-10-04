package org.example;

import org.example.Controllers.UserController;
import org.example.Models.Stream;
import org.example.Models.Student;
import org.example.Models.StudentGroup;
import org.example.Models.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

       // userController.createStudent("111","111", "111", LocalDate.ofYearDay(2003, 15));
        Teacher teacher1 = new Teacher("t1","t1", "t1", LocalDate.of(1111,1,1));
        Teacher teacher2 = new Teacher("t2","t2", "t2", LocalDate.of(2222,1,1));
        Student student111 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student112 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student113 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        StudentGroup studentGroup11 = new StudentGroup("n1", teacher1, new ArrayList<>(List.of(student111, student112, student113)));

        Student student121 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student122 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        StudentGroup studentGroup12 = new StudentGroup("n1", teacher1, new ArrayList<>(List.of(student121, student122)));

        userController.createStream("p1",List.of(studentGroup11, studentGroup12));

        Student student211 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student212 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student213 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        Student student214 = new Student("111","111", "111", LocalDate.of(2222,1,1));
        StudentGroup studentGroup21 = new StudentGroup("n1", teacher1, new ArrayList<>(List.of(student211, student212, student213, student214)));

        userController.createStream("p2", List.of(studentGroup21));

        userController.printStreams();
        var stream = userController.getSortedCountStudentGroupFromStream();

        UserController userController1 = new UserController();
        userController1.createStream(stream);
        System.out.println("Отсортирован:\n");
        userController.printStreams();
    }
}