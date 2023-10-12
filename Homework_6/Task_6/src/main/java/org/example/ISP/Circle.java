package org.example.ISP;

public class Circle implements Shape {
    // принцип разделения интерфейсов, каждый интерфейс соответствует определенному действию(действиям)
    // для круга мы не можем расчитать объем, так как это не объемная фигура
    // поэтому наследуемся только от интерфейса с расчпетом площади
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
