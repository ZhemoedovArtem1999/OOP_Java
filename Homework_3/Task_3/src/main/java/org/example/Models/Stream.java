package org.example.Models;

import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private String Title;
    private List<StudentGroup> groups;

    public Stream(String title, List<StudentGroup> groups) {
        Title = title;
        this.groups = groups;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }
    @Override
    public String toString() {
        return "Title - " + this.Title +
                " Кол-во групп - " + this.groups.size();
    }
    @Override
    public StreamIterator iterator() {
        return new StreamIterator((List<StudentGroup>) this);

    }
}
