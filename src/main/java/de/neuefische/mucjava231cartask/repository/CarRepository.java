package de.neuefische.mucjava231cartask.repository;

import de.neuefische.mucjava231cartask.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {

    private final List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    /*
    Alternative, wenn man das Objekt, welches man hinzugefügt hat,
    wieder zurückgeben möchte:

    public Car addCar(Car car){
        return cars.add(car);
    }
    */

    public List<Car> getCars(){
        return cars;
    }
}
