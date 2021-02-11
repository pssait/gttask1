package com.gt.jpa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gt.jpa.bean.Employee;
import com.gt.jpa.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping("/employee/{city}")
	public List<Employee> getEmployeesByCity(@PathVariable String city) {
		List<Employee> list = repo.findByAddressesCity(city);
		return list;
	}

}
