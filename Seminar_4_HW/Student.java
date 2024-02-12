package Seminar_4_HW;

public class Student extends User implements Comparable<Student> {

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    private Long studentID;
    
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
    
    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}
