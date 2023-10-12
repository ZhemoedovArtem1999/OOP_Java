package org.example.LSP;

public class Rectangle extends QuadRangle {

    // класс прямоугольник, наследник четырехугольника,
    // имеюший длинну и ширину, который расчитывает площадь
    // исходя из длины и ширины прямоугольника,
    // что соответствует принципу Барбары Лисков, т.к. также расчитывает площадь
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
