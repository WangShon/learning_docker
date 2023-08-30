package com.sonkq.librarymanagement.library;

import com.sonkq.librarymanagement.library.controller.StudentController;
import com.sonkq.librarymanagement.library.repository.StudentRepository;
import com.sonkq.librarymanagement.library.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@EnableAutoConfiguration
@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan(basePackageClasses = {StudentController.class, StudentService.class, StudentRepository.class})
public class LibraryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}
}
