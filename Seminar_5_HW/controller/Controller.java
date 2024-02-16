package Seminar_5_HW.controller;

import Seminar_5_HW.model.*;
import Seminar_5_HW.service.DataService;
import Seminar_5_HW.service.StudyGroupService;
import Seminar_5_HW.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public StudyGroup createStudyGroup(int teacherID, List<Integer> studentId) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherID);
        List<Student> students = new ArrayList<>();
        for (int id : studentId) {
            Student student = (Student) service.getUserById(Type.STUDENT, id);
            students.add(student);
        }
        return studyGroupService.getNewStudyGroup(teacher, students);
    }
}
