package com.relationship.Client.Repositoy;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.relationship.Client.Entity.Teacher;

@Repository
public interface Teacher_Repository extends JpaRepository<Teacher, Integer>{
		

}
