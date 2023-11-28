package com.fyc.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.fyc.api.entity.Employee;;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	// @Query(name="Employee.findByName")
	List<Employee> findByName(@Param("name") String name);
}
