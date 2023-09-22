package com.jspiders.carrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.carrest.pojo.AdminPOJO;
import com.jspiders.carrest.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository repository;

	public AdminPOJO createAccount(AdminPOJO pojo) {
		AdminPOJO admin = repository.createAccount(pojo);
		return admin;
	}

	public AdminPOJO login(AdminPOJO pojo) {
		AdminPOJO admin = repository.login(pojo);
		return admin;
	}
}
