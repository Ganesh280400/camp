package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dto.StdDto;

public interface StdRepo extends JpaRepository<StdDto, Integer> {

	@Query("select name from StdDto")
	public List<String> getStudentNames();
	
	@Query("select name from StdDto where id=:id")
	public String getStudentNameById(@Param("id") Integer id);
}
