package com.springboot.tcsemployemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tcsemployemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
