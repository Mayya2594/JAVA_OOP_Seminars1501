package Seminar_4_HW;

public interface UserController<T extends User> {
    
void create(String firstName, String lastName, String middleName);
}
