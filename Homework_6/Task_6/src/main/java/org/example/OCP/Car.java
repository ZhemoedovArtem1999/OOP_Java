package org.example.OCP;

public class Car extends Vehicle{
    // тоже самое что и с автобусом
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}
