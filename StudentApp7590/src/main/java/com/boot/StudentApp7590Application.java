package com.boot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class StudentApp7590Application {

	public static void main(String[] args)
	{
		SpringApplication.run(StudentApp7590Application.class, args);
	}
@Bean
public ModelMapper getModelMapper()
{
	ModelMapper model=new ModelMapper();
	return model;
}
}
