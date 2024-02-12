package Seminar_4_HW;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private String nameOfGroup;
    private List<StudentGroup> studentGroups;

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
    
}
