package web.models;

import java.util.Objects;

public class Car {
    private String model;
    private int version;
    private String color;

    public Car(String model, int version, String color) {
        this.model = model;
        this.version = version;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return version == car.version && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, version, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", version=" + version +
                ", color='" + color + '\'' +
                '}';
    }
}
