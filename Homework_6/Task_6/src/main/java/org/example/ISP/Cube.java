package org.example.ISP;

public class Cube implements Shape, Shape3D {
    // классу куб присущи и расчет площади и расчет объема, т.к. куб объемная фигура,
    // поэтому наследуемся от двух интерфейсов

    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length * 6;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
