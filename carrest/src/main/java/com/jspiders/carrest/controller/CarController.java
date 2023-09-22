package com.jspiders.carrest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.carrest.pojo.CarPOJO;
import com.jspiders.carrest.response.CarResponse;
import com.jspiders.carrest.service.CarService;

@RestController
public class CarController {
@Autowired

private CarService service ;

//ADD CAR LOGIC
@PostMapping(path = "/add",
consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<CarResponse>addCar(@RequestBody CarPOJO pojo){
	CarPOJO car = service.addCar(pojo);
	if (car != null) {
		//IF SUCCESS
		return new ResponseEntity<CarResponse>(new CarResponse("Data added successfully. ", car, null), HttpStatus.ACCEPTED);
		}
		//IF FAILURE
		return new ResponseEntity<CarResponse>(new CarResponse("Data not added. ", null, null), HttpStatus.ACCEPTED);
		}

//REMOVE CAR LOGIC
@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<CarResponse> removeCar(@PathVariable int id) {
	CarPOJO car = service.removeCar(id);

	// IF SUCCESS
	if (car != null) {
		return new ResponseEntity<CarResponse>(
				new CarResponse("Data removed successfully. ", car, null), HttpStatus.OK);
	}

	// IF FAILURE
	return new ResponseEntity<CarResponse>(new CarResponse("Data not removed. ", null, null),
			HttpStatus.BAD_REQUEST);
}

//SEARCH CAR LOGIC BY ID

@GetMapping(path = "/search/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<CarResponse> searchCar(@PathVariable int id) {
	CarPOJO car = service.searchCar(id);

	// IF SUCCESS
	if (car != null) {
		return new ResponseEntity<CarResponse>(new CarResponse("Data found successfully. ", car, null),
				HttpStatus.FOUND);
	}

	// IF FAILURE
	return new ResponseEntity<CarResponse>(new CarResponse("Data not found. ", car, null),
			HttpStatus.NOT_FOUND);
}

//SEARCH ALL CAR
@GetMapping(path = "/searchAll", produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<CarResponse> searchAllCars() {
	List<CarPOJO> cars = service.searchAllCars();

	// IF SUCCESS
	if (cars.isEmpty() == false) {
		return new ResponseEntity<CarResponse>(new CarResponse("Data found successfully. ", null, cars),
				HttpStatus.FOUND);
	}
	// IF FAILURE
	return new ResponseEntity<CarResponse>(new CarResponse("Data not found. ", null, null),
			HttpStatus.NOT_FOUND);
}

//UPDATE CAR LOGIC
@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<CarResponse> updateCar(@RequestBody CarPOJO pojo) {
	CarPOJO car = service.updateCar(pojo);

	// IF SUCCESS
	if (car != null) {
		return new ResponseEntity<CarResponse>(
				new CarResponse("Data updated successfully. ", car, null), HttpStatus.ACCEPTED);
	}

	// IF FAILURE
	return new ResponseEntity<CarResponse>(new CarResponse("Data not updated. ", null, null),HttpStatus.NOT_ACCEPTABLE);
}
}
