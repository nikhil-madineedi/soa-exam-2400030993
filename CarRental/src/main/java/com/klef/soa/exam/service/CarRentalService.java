package com.klef.soa.exam.service;

import com.klef.soa.exam.entity.CarRental;
import java.util.List;
import java.util.Optional;

public interface CarRentalService {

    CarRental addCar(CarRental car);

    List<CarRental> getAllCars();

    CarRental getCarById(Long id);

    CarRental updateCar(Long id, CarRental car);

    String deleteCar(Long id);
}