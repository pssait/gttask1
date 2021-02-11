package com.gt.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gt.jpa.bean.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	List<Employee> findByAddressesCity(String city);

}
