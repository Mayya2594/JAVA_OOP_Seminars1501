package Seminar_5_HW.service;

import Seminar_5_HW.model.Student;
import Seminar_5_HW.model.StudyGroup;
import Seminar_5_HW.model.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup getNewStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
