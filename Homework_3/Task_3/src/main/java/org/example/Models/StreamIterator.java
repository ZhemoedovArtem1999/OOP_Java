package org.example.Models;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> groupList;
    public StreamIterator(List<StudentGroup> groupList) {
        this.groupList = groupList;
        this.counter = 0;

    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return groupList.get(counter);    }
}
