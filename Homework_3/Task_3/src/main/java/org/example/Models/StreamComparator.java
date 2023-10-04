package org.example.Models;

import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.getGroups().size() == o2.getGroups().size() ?
                0 : o1.getGroups().size() > o2.getGroups().size() ? 1
                : -1;
    }
}
