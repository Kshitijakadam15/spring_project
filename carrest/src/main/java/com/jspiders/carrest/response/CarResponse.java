package com.jspiders.carrest.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspiders.carrest.pojo.CarPOJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class CarResponse {
	private String msg;
	private CarPOJO car;
	private List<CarPOJO> cars;
}
