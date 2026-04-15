package com.School.Management.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.School.Management.Entity.Teacher;

import jakarta.transaction.Transactional;

@Repository
public interface Teacher_Repository extends JpaRepository<Teacher, Integer>{

	
	
	@Query(value="select * from teacher where name= :nm;",nativeQuery=true)
	List<Teacher> getByName(@Param (value="nm") String name);
	
	
	@Modifying
	@Transactional
	@Query(value=" update teacher set email= :email where id= :id;", nativeQuery=true)
	
	int updatemail(@Param(value="id")int id, @Param(value="email")String email);
	
	
	
}
