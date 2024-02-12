package Seminar_4_HW;

import java.util.List;

public class StudentVieu implements UserVieu<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student.getStudentID());
        }
    }
}