package com.JPA.connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Teacher;


@Repository
public interface Teacher_Repository extends JpaRepository<Teacher, Integer> {

}
