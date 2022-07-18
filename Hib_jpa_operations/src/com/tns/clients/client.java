package com.tns.clients;

import com.tns.entities.student;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client 
{
    
	public static void main(String[] args) 
	{
	   
        studentservice service = new studentserviceimpl();
        
        student student = new student();
        
        student.setStudent_id(106);
        student.setName("Sanjay");
        service.addstudent(student);
        
        student = service.findstudentbyId(105);
        System.out.println("ID:"+student.getStudent_id());
        System.out.println("Name:"+student.getName());
        
        student = service.findstudentbyId(106);
        student.setName("Sanjay");
        service.updatestudent(student);
        
        student = service.findstudentbyId(106);
        System.out.println("ID:"+student.getStudent_id());
        System.out.println("Name:"+student.getName());
        
        student = service.findstudentbyId(106);
        service.removestudent(student);
        System.out.println("End of program/Life cycle completed...");
		
	}
}
