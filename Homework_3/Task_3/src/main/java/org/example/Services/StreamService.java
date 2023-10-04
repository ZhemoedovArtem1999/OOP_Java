package org.example.Services;

import org.example.Models.*;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streams;

    public void createStreams(String title, List<StudentGroup> groups) {

        if (this.streams == null)
            this.streams = new ArrayList<>();
        this.streams.add(new Stream(title, groups));
    }
    public void createStreams(List<Stream> streams) {

        if (this.streams == null)
            this.streams = new ArrayList<>();
        this.streams.addAll(streams);
    }
    public  void addStream(Stream stream) {
        if (streams == null)
            streams = new ArrayList<>();
        streams.add(stream);
    }

    public List<Stream> getStreams() {
        return streams;
    }


    public List<Stream> getSortedByCountStudentGroup(){
        //List<StudentGroup> groups = new ArrayList<StudentGroup>(stream.getGroups());
        streams.sort(new StreamComparator());
        return streams;
    }


}
