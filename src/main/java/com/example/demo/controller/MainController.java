package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class MainController {

	@ResponseBody
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee employee = new Employee(1, "kevin james", "manager", 85231);

		return employee;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "Hello Controller";
	}

}
