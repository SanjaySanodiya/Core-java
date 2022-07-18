package com.tns.dao;

import com.tns.entities.*;

public interface studentimpl 
{
    // CRUD Operation
	public abstract void student(student student);
	public abstract student getstudentbyId(int id);
	public abstract void updatestudent(student student);
	public abstract void removestudent(student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
