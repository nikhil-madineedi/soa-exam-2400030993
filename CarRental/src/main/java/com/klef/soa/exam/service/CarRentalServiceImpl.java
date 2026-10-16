package com.klef.soa.exam.service;

import com.klef.soa.exam.entity.CarRental;
import com.klef.soa.exam.repository.CarRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRentalServiceImpl implements CarRentalService {

    @Autowired
    private CarRentalRepository crr;
    


	@Override
	public CarRental addCar(CarRental car) {
		
		return crr.save(car);
	}

	@Override
	public List<CarRental> getAllCars() {
		
		
		return crr.findAll();
		
		// TODO Auto-generated method stub

	}

	@Override
    public CarRental getCarById(Long id) {
        return crr.findById(id).orElse(null);
    }

    @Override
    public CarRental updateCar(Long id, CarRental car) {
        CarRental c = crr.findById(id).orElse(null);

        if (c != null) {
            c.setVehicleModel(car.getVehicleModel());
            c.setDailyRate(car.getDailyRate());
            c.setPickupLocation(car.getPickupLocation());
            c.setAvailable(car.getAvailable());

            return crr.save(c);
        }

        return null;
    }

	@Override
	public String deleteCar(Long id) {
		if(crr.existsById(id)) {
			crr.deleteById(id);
			return "Car deleted successfully..!!";
		}
		return "Car not found by the id";
	}
	
	
}