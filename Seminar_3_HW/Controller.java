package Seminar_3_HW;

import java.util.List;

public class Controller {
    
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    private StreamService streamService = new StreamService();

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public List<Stream> gerStreamSorted(List<Stream> streams) {
        return streamService.gerStreamSorted(streams);
    }

}