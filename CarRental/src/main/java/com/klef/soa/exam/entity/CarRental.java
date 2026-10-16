package com.klef.soa.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_rental")
public class CarRental {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String vehicleModel;
	private Double dailyRate;
	

	private String pickupLocation;
	private Boolean available;
	
	

    public CarRental(Long id, String vehicleModel, Double dailyRate, String pickupLocation, Boolean available) {
		super();
		this.id = id;
		this.vehicleModel = vehicleModel;
		this.dailyRate = dailyRate;
		this.pickupLocation = pickupLocation;
		this.available = available;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public Double getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "CarRental [id=" + id + ", vehicleModel=" + vehicleModel + ", dailyRate=" + dailyRate
				+ ", pickupLocation=" + pickupLocation + ", available=" + available + "]";
	}
	
	public CarRental() {
		super();
	}
	
    
}
