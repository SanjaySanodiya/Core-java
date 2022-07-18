package com.tns.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class student implements Serializable
{
    public static final long serialVersionUID=1L;
	@Id
	private int id;
	private String name;
	
	public int getStudent_id() {
		return id;
	}
	public void setStudent_id(int student_id) {
		this.id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
