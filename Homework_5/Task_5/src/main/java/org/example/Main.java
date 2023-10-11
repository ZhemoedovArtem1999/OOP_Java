package org.example;


import org.example.Controlers.MainControler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainControler controller = new MainControler();

        controller.createTeacher("t1", "t1", "t1", "t1");
        controller.createStudent("s1", "s1", "s1", "s1");
        controller.createStudent("s2", "s2", "s2", "s2");
        controller.createStudent("s3", "s3", "s3", "s3");
        controller.createStudent("s4", "s4", "s4", "s4");
        Integer[] ids = {1,2,3,4};
        List<Integer> studentIds = Arrays.asList(ids);;
        controller.formingStudyGroup(studentIds, 1);

        controller.getStudyGroupView();

        controller.formingStudyGroup(studentIds, 2);
    }
}