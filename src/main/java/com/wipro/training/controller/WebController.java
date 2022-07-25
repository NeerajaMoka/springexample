package com.wipro.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.training.model.Student;

@RestController

public class WebController {
	//http://localhost8080
	//port:8182
	@GetMapping("/")
	public String home() {
	return "Welcome to my First Spring Book Home Response";
	}
	@GetMapping("/about")
	public String about() {
		return "wipro Java Training is going on";
	}
	@GetMapping("/getstudent")
	public Student get() {
		Student ob=new Student(101,"Vikas Parmar",12000,"Indore");
		return ob;
	}
	@GetMapping("/Liststudent")
	public List<Student>list(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101,"Vikas Parmar",12000,"Indore"));
		list.add(new Student(102,"Mohan Sharma",43000,"Ujjain"));
		list.add(new Student(103,"Vijay Prajapati",25000,"Indore"));
		list.add(new Student(104,"Vikas Parmar",12000,"Indore"));
		return list;
	}
}

