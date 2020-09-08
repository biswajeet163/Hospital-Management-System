package com.hr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.DoctorsList;
import com.hr.model.Employee;

@RestController
@RequestMapping(value = "/hr")
public class HrController {

	List<Employee> emp = Arrays.asList(

			new Employee(1, "Biswa1", "Roy1", "Brain"), new Employee(2, "Biswa2", "Roy2", "Brain"),
			new Employee(3, "Biswa3", "Roy3", "Brain"), new Employee(4, "Biswa4", "Roy4", "Brain")

	);

	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public List<Employee> getDoctors() {

		return emp;

	}
	// It is for Admission calls
	@RequestMapping(value = "/doctors-list", method = RequestMethod.GET)
	public DoctorsList getDoctorsList() {

		DoctorsList doctorList= new DoctorsList();
		doctorList.setDoctorList(emp);
		
		return doctorList;

	}

	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public Employee getDoctorsById(@PathVariable int id) {
		int len = emp.size();
		for (int i = 0; i < len; i++) {
			Employee e = emp.get(i);
			if (e.getId() == id) {
				return e;
			}
		}

		return null;

	}

}
