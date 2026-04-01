package com.relationship.Client.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.Client.Entity.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Integer>{

}
