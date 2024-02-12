package Seminar_4_HW;

public class Teacher extends User implements Comparable<Teacher> {

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    private Long teacherID;
    
    public Long getTeacherID() {
        return teacherID;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherID.compareTo(o.teacherID);
    }
    
}
