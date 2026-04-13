package com.ME.exception_handling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ME.exception_handling.Entity.Department;

@Repository
public interface Department_Repository extends JpaRepository<Department, Integer> {

}
