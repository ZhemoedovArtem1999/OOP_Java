package org.example.OCP;

public class Bus extends Vehicle{
    // данный класс представляет автобус, и тем самым расширяет возможности транспоортного
    // средства (добавляет свой расчет максимальной скорости)
    // тем самым добиваемся, что в базовом классе не происходит множество сравнений с типом транспортного средства
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
