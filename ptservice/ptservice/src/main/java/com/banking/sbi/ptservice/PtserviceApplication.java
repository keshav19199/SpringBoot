package com.banking.sbi.ptservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.banking.sbi.ptservice.Classes.Student;

@SpringBootApplication
public class PtserviceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(PtserviceApplication.class, args);
	
		System.out.println(context.getBeanDefinitionCount());
		
//		for(String s:context.getBeanDefinitionNames())
//		{
//			System.out.println(s);
//		}
		
//		Student st=context.getBean(Student.class);
//		System.out.println(st.greet());
	}

}
