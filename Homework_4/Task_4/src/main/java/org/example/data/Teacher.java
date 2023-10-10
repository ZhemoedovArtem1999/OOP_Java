package org.example.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        this(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Teacher: id = " + this.teacherId + " firstName = " + super.getFirstName() +
                " secondName = " + super.getSecondName() + " patronomyc = " + super.getPatronymic() +
                "dateOfBirth = " + super.getDateOfBirth();
    }
}