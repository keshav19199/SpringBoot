package com.School.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.School.Management.Entity.Student;

@Repository
public interface Student_repository extends JpaRepository<Student, Integer>{

}
