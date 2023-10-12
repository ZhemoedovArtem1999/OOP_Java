package org.example.OCP;

public class Vehicle {
    // данный класс представляет транспортное средство
    private int maxSpeed;
    private String type;

    public double calculateAllowedSpeed(){
        return maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


}
