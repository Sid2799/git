package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private long id;
	private String title;
	
	private String descrioption;

	public Course(long id, String title, String descrioption) {
		super();
		this.id = id;
		this.title = title;
		this.descrioption = descrioption;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrioption() {
		return descrioption;
	}

	public void setDescrioption(String descrioption) {
		this.descrioption = descrioption;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descrioption=" + descrioption + "]";
	}
	
	

}
