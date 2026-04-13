package com.ME.exception_handling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ME.exception_handling.Entity.Employee;

@Repository
public interface Employee_Repository extends JpaRepository<Employee, Integer> {

}
