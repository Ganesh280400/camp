package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.StdDto;
import com.service.StdService;

@RestController
public class StudentController {

	@Autowired
	StdService stdService;

	@PostMapping("/savestudents")
	public void savestudent(@RequestBody StdDto stdDto) {
		stdService.savestudent(stdDto);

	}

	@GetMapping("/getstudent")
	public StdDto getstudents(@RequestParam("id") Integer id) {
		return stdService.getstudents(id);

	}

	@PutMapping("/updatestudent/{id}")
	public void updatestudent(@RequestBody StdDto stdDto, @PathVariable("id") int id) {

		stdService.updatestudent(stdDto, id);

	}

	@DeleteMapping("/deletestudent/{id}")

	public void deletestudent(@PathVariable("id") Integer id) {

		stdService.deletestudent(id);
	}
	
	@GetMapping("/getstudentnames")
	public List<String> getStudentNames() {
		return stdService.getStudentNames();
	}
	
	@GetMapping("/studentnamebyid/{id}")
	public String getStudentNameById(@PathVariable("id") Integer id) {
		return stdService.getStudentNameById(id);
	}


}
