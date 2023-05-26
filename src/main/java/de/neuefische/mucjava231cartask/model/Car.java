package de.neuefische.mucjava231cartask.model;

import java.util.Objects;

public class Car {

    private String id;
    private String brand;
    private int amountOfTires;
    private boolean hasTuev;

    public Car(String id, String brand, int amountOfTires, boolean hasTuev) {
        this.id = id;
        this.brand = brand;
        this.amountOfTires = amountOfTires;
        this.hasTuev = hasTuev;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmountOfTires() {
        return amountOfTires;
    }

    public void setAmountOfTires(int amountOfTires) {
        this.amountOfTires = amountOfTires;
    }

    public boolean isHasTuev() {
        return hasTuev;
    }

    public void setHasTuev(boolean hasTuev) {
        this.hasTuev = hasTuev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (amountOfTires != car.amountOfTires) return false;
        if (hasTuev != car.hasTuev) return false;
        return Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + amountOfTires;
        result = 31 * result + (hasTuev ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", amountOfTires=" + amountOfTires +
               ", hasTuev=" + hasTuev +
               '}';
    }
}
