package org.example.Service;

import org.example.Models.Student;
import org.example.Models.StudyGroup;
import org.example.Models.Teacher;

import java.util.List;

public class StudyGroupService {
    StudyGroup studyGroup;
    public StudyGroup formingStudyGroup(Teacher teacher, List<Student> students){
        return this.studyGroup = new StudyGroup(teacher, students);

    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
