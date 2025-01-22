package cargo;

import java.awt.*;

public class Car {

    private int age;

    private Color color;

    private int passengersCount;

    private int weight;

    public Car(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public int getWeight() {
        return weight;
    }
}
