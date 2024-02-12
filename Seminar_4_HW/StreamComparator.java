package Seminar_4_HW;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int quantityStream1 = o1.getStudentGroups().size();
        int quantityStream2 = o2.getStudentGroups().size();
        return Integer.compare(quantityStream1, quantityStream2);
    }
    
}
