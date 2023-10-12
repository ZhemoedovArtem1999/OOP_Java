package org.example.LSP;

public class Square extends QuadRangle{

    // класс квадрат, наследник четырехугольника,
    // имеюший только длину стороны, который расчитывает площадь
    // исходя из только из длины стороны прямоугольника,
    // что соответствует принципу Барбары Лисков, т.к. также расчитывает площадь
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
