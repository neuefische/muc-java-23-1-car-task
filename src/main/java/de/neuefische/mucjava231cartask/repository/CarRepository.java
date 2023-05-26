package de.neuefische.mucjava231cartask.repository;

import de.neuefische.mucjava231cartask.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Repository
public class CarRepository {

    private final List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        car.setId(UUID.randomUUID().toString());
        cars.add(car);
    }

    /*
    Alternative, wenn man das Objekt, welches man hinzugefügt hat,
    wieder zurückgeben möchte:

    public Car addCar(Car car){
        car.setId(UUID.randomUUID().toString());
        return cars.add(car);
    }
    */

    public List<Car> getCars(){
        return cars;
    }

    public Car getCarById(String id){
        for(Car car : cars){
            if(car.getId().equals(id)){
                return car;
            }
        }
        throw new NoSuchElementException("Car not found!");
    }

    public Car updateCar(String id, Car car){
        Car carToUpdate = getCarById(id);

        carToUpdate.setBrand(car.getBrand());
        carToUpdate.setAmountOfTires(car.getAmountOfTires());
        carToUpdate.setHasTuev(car.isHasTuev());

        return carToUpdate;
    }

    public void deleteCar(String id){
        Car carToDelete = getCarById(id);
        cars.remove(carToDelete);
    }
}
