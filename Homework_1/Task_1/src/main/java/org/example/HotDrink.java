package org.example;

public class HotDrink extends  BottleOfWater {
    private int temperature;
    public HotDrink(String name, double cost, int volume, int temeperatue) {
        super(name, cost, volume);
        this.temperature = temeperatue;

    }
    public int getTemperature()
    {
        return this.temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "volume='" + super.getVolume() + '\'' +
                "temperature='" + this.temperature + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }
}
