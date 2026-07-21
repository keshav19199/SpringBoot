package com.pune_metro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.pune_metro.entity.User;

@Repository
public interface User_Repo extends JpaRepository<User, Integer>{

}
