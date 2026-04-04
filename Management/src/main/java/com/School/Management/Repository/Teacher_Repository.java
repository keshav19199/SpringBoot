package com.School.Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.School.Management.Entity.Teacher;

@Repository
public interface Teacher_Repository extends JpaRepository<Teacher, Integer>{

}
