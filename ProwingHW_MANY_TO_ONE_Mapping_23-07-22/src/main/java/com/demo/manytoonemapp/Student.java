package com.demo.manytoonemapp;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Roll_Num")
	private int rollno;
	
	@Column(name="Name")
	private String name;
	
	
//	private List<Laptop> laptop;
//	
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
		
}
