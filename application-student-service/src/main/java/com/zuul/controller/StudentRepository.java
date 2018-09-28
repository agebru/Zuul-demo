package com.zuul.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.zuul.model.Address;
import com.zuul.model.Student;

public class StudentRepository {
	private static List<Student> students;
	private static Student defaultStudent=new Student(new Integer(000),"Dummy Student",null);
	
	static {
		students=new ArrayList<>();
		
		Student abebe=new Student(10,"Abebe",Arrays.asList(new Address(10153,"sweden-street","Stockholm"),new Address(10158,"stock-street","Stockholm")));
		Student amanuel=new Student(20,"Amanuel",Arrays.asList(new Address(30076,"Rosewell-street","Rosewell"),new Address(43213,"Santa barbara ct","Columbus")));
		Student selam=new Student(30,"Selam",Arrays.asList(new Address(20123,"Dallas street","Dallas")));
		Student melat=new Student(40,"Melat",Arrays.asList(new Address(54321,"CMC","Addis Ababa"),new Address(43210,"Mekelle St.","Mekelle")));
		Student hagos=new Student(50,"Hagos",Arrays.asList(new Address(20013,"Adi-abun","Adwa")));
		
		students.add(abebe);
		students.add(amanuel);
		students.add(selam);
		students.add(melat);
		students.add(hagos);
	}
	
	
	public static List<Student> loadStudents(){
		return students;
	}
	
	// without using Optional
	/*public static Student getStudent(int id){
		return students.stream().filter(student->student.getId()==id).findFirst().get();
	}*/
	
	public static Optional<Student> getStudent(int id){
		if(Optional.of(students.stream().filter(student->student.getId()==id).findFirst()).isPresent()) {
			return students.stream().filter(student->student.getId()==id).findFirst();
		}
		else {
			//return Optional.empty();
			return Optional.ofNullable(defaultStudent);
		}
		
	}

}
