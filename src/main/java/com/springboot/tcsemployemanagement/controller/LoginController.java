package com.springboot.tcsemployemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.tcsemployemanagement.model.Employee;
import com.springboot.tcsemployemanagement.model.LoginInfo;
import com.springboot.tcsemployemanagement.repository.EmployeeRepository;
import com.springboot.tcsemployemanagement.repository.LoginInfoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class LoginController {

	@Autowired
	private LoginInfoRepository loginInfoRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/loginauth")
	public boolean loginAuthentication(@RequestBody LoginInfo loginInfo) {
		boolean isLoginSuccess = false;
		Optional<LoginInfo> info = loginInfoRepository.findById(loginInfo.getUsername());
		LoginInfo detailsFromDb = info.get();
		if (loginInfo.getUsername().equals(detailsFromDb.getUsername())
				&& loginInfo.getPassword().equals(detailsFromDb.getPassword())) {
			isLoginSuccess = true;
		}
		return isLoginSuccess;
	}

	@GetMapping("/loginauth/{username}")
	public Employee employeeProfilesPage(@PathVariable(name = "username") String username) {
		Employee employee = null;
		List<Employee> employeeList = employeeRepository.findAll();
		for (Employee element : employeeList) {
			if (element.getEmailId().equals(username)) {
				employee = element;
			}
		}
		return employee;
	}

}
