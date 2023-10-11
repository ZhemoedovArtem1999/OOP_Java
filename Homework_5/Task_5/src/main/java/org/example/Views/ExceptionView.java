package org.example.Views;

public class ExceptionView implements View<String>{
    @Override
    public void printOnConsole(String item) {
        System.out.println(item);
    }
}
