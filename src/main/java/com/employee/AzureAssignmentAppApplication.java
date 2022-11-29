package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController



public class AzureAssignmentAppApplication {
	
	 @Autowired
	    private EmployeeRepository repository;

	    @PostMapping("/employee")
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return repository.save(employee);
	    }

	    @GetMapping("/employees")
	    public List<Employee> getEmployees() {
	        return repository.findAll();
	    }


	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentAppApplication.class, args);
	}

}
