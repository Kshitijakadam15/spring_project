package com.jspiders.carmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.carmvc.pojo.CarPOJO;
import com.jspiders.carmvc.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository repository;
	
	public CarPOJO addCar(String name, double price, String color, String fueltype) {
		CarPOJO pojo = repository.addCar(name, price, color, fueltype);
		return pojo;
	}

	public List<CarPOJO> findAllCars() {
		List<CarPOJO> cars = repository.findAllCars();
		return cars;
	}

	public CarPOJO searchcar(int id) {
		CarPOJO pojo = repository.searchCar(id);
		return pojo;
	}

	public CarPOJO removeCar(int id) {
		CarPOJO pojo = repository.removeCar(id);
		return pojo;
	}

	public CarPOJO updateCar(int id, String name, double price, String color, String fueltype) {
		CarPOJO pojo = repository.updateCar(id, name, price, color, fueltype);
		return pojo;
	}

}

	


