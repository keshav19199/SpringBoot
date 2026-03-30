package com.JPA.connectivity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.connectivity.Entity.Book;
import com.JPA.connectivity.Repository.Book_Repository;

@RestController
public class BookController {

	@Autowired
	public Book_Repository repo;
	
	@PostMapping("/add-Book")
	public String add(@RequestBody Book b)
	{
		repo.save(b);
		return b.getName()+" save successful";
	}
	
	
	@GetMapping("/get-allbook")
	public List<Book> get()
	{
		return repo.findAll();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable(value="id")int id)
	{
		repo.deleteById(id);
		return "deleted!..";
	}
	
}
