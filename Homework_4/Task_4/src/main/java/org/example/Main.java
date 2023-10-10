package org.example;

import org.example.controller.TeacherController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();


        controller.create("1","1", "1", LocalDate.of(1999,2,2));

        controller.create("2","2", "2", LocalDate.of(1999,2,2));

        controller.create("3","3", "3", LocalDate.of(1999,2,2));

        controller.viewTeachers();

        System.out.println("Updater:");

        controller.update(2L, "4", "4", "4", LocalDate.of(1998,12,12));

        controller.viewTeachers();

        System.out.println("Deleter:");

        controller.delete(2L);

        controller.viewTeachers();

        System.out.println("Creater:");

        controller.create("2","2", "2", LocalDate.of(1999,2,2));

        controller.viewTeachers();

        System.out.println("Удаление несуществующего:");

        controller.delete(50L);

        controller.viewTeachers();

    }
}