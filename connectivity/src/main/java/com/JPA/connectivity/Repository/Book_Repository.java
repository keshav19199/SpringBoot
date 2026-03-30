package com.JPA.connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPA.connectivity.Entity.Book;

@Repository
public interface Book_Repository extends JpaRepository<Book, Integer>{

}
