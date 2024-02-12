package Seminar_4_HW;

import java.util.List;

public class TeacherVieu implements UserVieu<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getFirstName() + teacher.getMiddleName() + teacher.getLastName());
        }
    }
}