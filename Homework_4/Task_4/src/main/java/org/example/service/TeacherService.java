package org.example.service;

import org.example.data.Student;
import org.example.data.Teacher;
import org.example.view.ViewException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class TeacherService implements UserService<Teacher> {

        private final List<Teacher> teachers;

        public TeacherService() {
            this.teachers = new ArrayList<>();
        }

        @Override
        public List<Teacher> getAll() {
            return teachers;
        }

        @Override
        public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
            Long countMaxId = 0L;
            for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
                }
            }
            countMaxId++;
            Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
            teachers.add(teacher);
        }

        public  void update(Long id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth)
        {
            for (var teacher: teachers) {
                if (teacher.getTeacherId().equals(id)){
                    teacher.setFirstName(firstName);
                    teacher.setSecondName(secondName);
                    teacher.setPatronymic(patronymic);
                    teacher.setDateOfBirth(dateOfBirth);
                    return;
                }
            }
            ViewException.Exception.SendExceptionMessage(String.format("Учителя с id = %d не существует!!!", id));
        }

        public  void delete(Long id)
        {
            for (var teacher: teachers) {
                if (teacher.getTeacherId().equals(id)){
                    teachers.remove(teacher);
                    return;
                }
            }
            ViewException.Exception.SendExceptionMessage(String.format("Учителя с id = %d не существует!!!", id));
        }
    }
