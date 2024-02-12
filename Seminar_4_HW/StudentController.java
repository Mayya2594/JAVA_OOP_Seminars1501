package Seminar_4_HW;

import java.util.List;

public class StudentController implements UserController<Student> {
    
    private final StudentGroupService studentGroupService = new StudentGroupService();

    private StreamService streamService = new StreamService();

    private final StudentVieu studentVieu = new StudentVieu();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList(); 
        studentVieu.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO(); 
        studentVieu.sendOnConsole(studentList);
        return studentList;
    }

    public StudentController(StreamService streamService) {
        this.streamService = streamService;
    }

    public List<Stream> gerStreamSorted(List<Stream> streams) {
        return streamService.gerStreamSorted(streams);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }

}