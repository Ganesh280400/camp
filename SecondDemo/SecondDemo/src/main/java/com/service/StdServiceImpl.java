package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.StdDto;
import com.repo.StdRepo;

@Service
public class StdServiceImpl implements StdService {
	@Autowired
	StdRepo repo;

	public void savestudent(StdDto stdDto) {
		repo.save(stdDto);

	}

	public StdDto getstudents(Integer id) {

		StdDto stddto = new StdDto();
		Optional<StdDto> obj = repo.findById(id);
		if (obj.isPresent()) {
			stddto = obj.get();
		}

		return stddto;
	}

	public void updatestudent(StdDto stdDtoInput, Integer id) {
		Optional<StdDto> obj = repo.findById(id);
		StdDto stddto = obj.get();
		stddto.setId(stdDtoInput.getId());
		stddto.setMarks(stdDtoInput.getMarks());
		stddto.setName(stdDtoInput.getName());
		repo.save(stddto);
	}

	public void deletestudent(Integer id) {
		repo.deleteById(id);

	}

	
	public List<String> getStudentNames() {
		return repo.getStudentNames();
		
	}

	
	public String getStudentNameById(Integer id) {
		
		return repo.getStudentNameById(id);
	}

}
