package Seminar_4_HW;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    
    private TeacherService teacherService;
    private TeacherVieu teacherVieu;

    public TeacherController(TeacherService teacherService, TeacherVieu teacherVieu) {
        this.teacherService = teacherService;
        this.teacherVieu = teacherVieu;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void edit(Teacher teacher, String newFirstName, String newMiddleName, String newLastName) {
        teacherService.editTeacher(teacher, newFirstName, newMiddleName, newLastName);
    }
    
    public void getAllTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        teacherVieu.sendOnConsole(teachers);
    }
}
