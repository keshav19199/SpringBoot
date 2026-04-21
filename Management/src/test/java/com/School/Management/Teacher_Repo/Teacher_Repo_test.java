package com.School.Management.Teacher_Repo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import com.School.Management.Entity.Teacher;
import com.School.Management.Repository.Teacher_Repository;

import jakarta.transaction.Transactional;

@DataJpaTest
@Transactional
@AutoConfigureTestDatabase
public class Teacher_Repo_test {

	@Autowired
	private Teacher_Repository repo;
	
	@Test
	public void TestAddTeacher()
	{
		Teacher t=new Teacher();
		t.setDegree("B.tech");
		t.setMobile("87786665");
		t.setName("MAARI");
		
		Teacher t2=repo.save(t);

		assertNotNull(t2);
	}
	
	@Test
	public void getByName()
	{
		Teacher t=new Teacher();
		t.setDegree("B.tech");
		t.setMobile("87786665");
		t.setName("MAARI");
		
		repo.save(t);
		
		List<Teacher> t2=repo.getByName("MAARI");
		
		assertNotEquals(0, t2.size());
	}
	
}
