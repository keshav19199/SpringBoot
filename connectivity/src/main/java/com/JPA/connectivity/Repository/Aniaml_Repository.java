package com.JPA.connectivity.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Animal;
import com.JPA.connectivity.Entity.Teacher;

@Repository
public interface Aniaml_Repository extends JpaRepository<Animal, Integer>{
	
	
	@Query(value="select * from Animal where name= :nm;",nativeQuery=true)
	List<Animal> getByName(@Param (value="nm") String name);
	

}
