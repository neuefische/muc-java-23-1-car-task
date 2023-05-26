package de.neuefische.mucjava231cartask.service;

import de.neuefische.mucjava231cartask.model.Car;
import de.neuefische.mucjava231cartask.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car){
        carRepository.addCar(car);
    }

    /*
    Alternative, wenn man das Objekt, welches man hinzugefügt hat,
    wieder zurückgeben möchte:

    public Car addCar(Car car){
        return carRepository.addCar(car);
    }
    */

    public List<Car> getCars(){
        return carRepository.getCars();
    }
}
