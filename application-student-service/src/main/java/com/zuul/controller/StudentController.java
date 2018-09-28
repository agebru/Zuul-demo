package com.zuul.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zuul.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private Environment env;
	public String home() {
		return "Default message from : "+env.getProperty("local.server.port");
	}
	
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> getAll(){
		return StudentRepository.loadStudents();
	}
	
	/*without using optional
	 * @RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	public Student getOne(@PathVariable("id") int id){
		return StudentRepository.getStudent(id);
	}*/
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	public Optional<Student> getOne(@PathVariable("id") int id){
		return StudentRepository.getStudent(id);
	}
	

}
