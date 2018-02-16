package com.syntel.database.DatabaseDemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String location;
	private Date birth_date;
	
	public Person() {
		
	}
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birthDate;
	}
	public Person(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birth_date = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birth_date;
	}
	public void setBirthDate(Date birthDate) {
		this.birth_date = birthDate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birth_date=" + birth_date + "]";
	}
	

}
