package Seminar_4_HW;

import java.util.List;

public interface UserVieu<T extends User> {
    
    void sendOnConsole(List<T> list);
}
