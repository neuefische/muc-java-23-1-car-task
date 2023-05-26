package de.neuefische.mucjava231cartask.controller;

import de.neuefische.mucjava231cartask.model.Car;
import de.neuefische.mucjava231cartask.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

    /*
    Alternative, wenn man das Objekt, welches man hinzugefügt hat,
    wieder zurückgeben möchte:

    @PostMapping
    public Car addCar(Car car){
        return carService.addCar(car);
    }
    */
}
