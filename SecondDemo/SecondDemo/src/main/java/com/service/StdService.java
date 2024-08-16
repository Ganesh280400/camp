package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dto.StdDto;

@Component
public interface StdService {

	public void savestudent(StdDto stdDto);

	public StdDto getstudents(Integer id);

	public void updatestudent(StdDto stdDto, Integer id);

	public void deletestudent(Integer id);
	
	public List<String> getStudentNames();
	
	public String getStudentNameById(Integer id);
}
