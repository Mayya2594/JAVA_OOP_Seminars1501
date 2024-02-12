package Seminar_4_HW;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void createTeacher(String firstName, String middleName, String lastName) {
        teachers.add(new Teacher(firstName, middleName, lastName));
    }

    public void editTeacher(Teacher teacher, String newFirstName, String newMiddleName, String newLastName) {
        teacher.setFirstName(newFirstName);
        teacher.setMiddleName(newMiddleName);
        teacher.setLastName(newLastName);
    }
}
