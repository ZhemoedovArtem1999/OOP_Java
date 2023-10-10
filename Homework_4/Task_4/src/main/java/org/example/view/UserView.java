package org.example.view;

import org.example.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}