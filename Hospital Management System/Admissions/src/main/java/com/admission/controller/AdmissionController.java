package com.admission.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admission.model.DiseaseList;
import com.admission.model.DoctorsList;
import com.admission.model.Patient;

@RestController
@RequestMapping(value = "/admission")
public class AdmissionController {

	private static List<Patient> data = new ArrayList<Patient>();

	@Autowired
	private RestTemplate restTemp;

	static {

		Patient p1 = new Patient(1, "Biswa1", "Indian");
		Patient p2 = new Patient(2, "Biswa2", "Indian");
		Patient p3 = new Patient(3, "Biswa3", "Indian");
		Patient p4 = new Patient(4, "Biswa4", "Indian");
		Patient p5 = new Patient(5, "Biswa5", "Indian");

		data.add(p1);
		data.add(p2);
		data.add(p3);
		data.add(p4);
		data.add(p5);

	}

	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public List<Patient> getpatients() {

		return data;
	}

	// calls form hr service
	@RequestMapping(value = "/physicians", method = RequestMethod.GET)
	public DoctorsList getPhysiciansList() {

		DoctorsList doctorsList = restTemp.getForObject("http://hr-service/hr/doctors-list", DoctorsList.class);

		return doctorsList;
	}

	// calls form pathology service
	@RequestMapping(value = "/alldisease", method = RequestMethod.GET)
	public DiseaseList getDiseaseList() {

		DiseaseList diseaseList = restTemp.getForObject("http://pathology-service/pathology/alldisease", DiseaseList.class);
		return diseaseList;

		
	}

	@RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
	public Patient geatientById(@PathVariable int id) {
		int len = data.size();
		for (int i = 0; i < len; i++) {
			Patient p = data.get(i);
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public void addPatient() {

	}

}
