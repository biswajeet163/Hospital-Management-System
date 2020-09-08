package com.pathology.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathology.model.DiseaseList;
import com.pathology.model.Disese;

@RestController
@RequestMapping(value="/pathology")
public class DiseseController {

	List<Disese> disease = Arrays.asList(

			new Disese(1, "PateDard", "Hazmola"), new Disese(2, "PateDard2", "Hazmola2"),
			new Disese(3, "PateDard3", "Hazmola3"), new Disese(4, "PateDard4", "Hazmola4"),
			new Disese(5, "PateDard5", "Hazmola5"), new Disese(6, "PateDard6", "Hazmola6"),
			new Disese(7, "PateDard7", "Hazmola7")

	);

	@RequestMapping(value = "/disease", method = RequestMethod.GET)
	public List<Disese> getDisaese() {
		return disease;
	}
	
	// for admission calls
	@RequestMapping(value = "/alldisease", method = RequestMethod.GET)
	public DiseaseList getDisaeseList() {
		DiseaseList dis= new DiseaseList();
		dis.setDisese(disease);;
		return dis;
	}

	@RequestMapping(value = "/disease/{id}", method = RequestMethod.GET)
	public Disese getDisaeseById(@PathVariable int id) {
		int len = disease.size();
		for (int i = 0; i < len; i++) {
			Disese d = disease.get(i);
			if (d.getId() == id) {
				return d;
			}
		}

		return null;
	}

}
