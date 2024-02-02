package Seminar_3_HW;

import java.util.List;

public class StreamService {
    
    public List<Stream> gerStreamSorted(List<Stream> streams) {
        streams.sort(new StreamComparator());
        return streams;
    }

}