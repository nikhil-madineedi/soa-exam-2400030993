package com.klef.soa.exam.controller;

import com.klef.soa.exam.entity.CarRental;
import com.klef.soa.exam.service.CarRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRentalController {

    @Autowired
    private CarRentalService CRS;

    @GetMapping("/")
    public String home() {
        return "Car Rental CRUD Service is running";
    }

    @PostMapping("/Add")
    public CarRental addCar(@RequestBody CarRental car) {
        return CRS.addCar(car);
    }

    @GetMapping("/DisplayAll")
    public List<CarRental> displayAll() {
        return CRS.getAllCars();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        return CRS.deleteCar(id);
    }
    
    
}

