package com.exam01;

import java.io.Serializable;

public class Student  implements Serializable {
	private String name;
	private String major;
	private String hack;
	private double grade;
	
	public Student(String name, String major, String hack,  double grade) {
		this.name=name;
		this.major=major;
		this.hack=hack;
		this.grade=grade;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getHack() {
		return hack;
	}

	public void setHack(String hack) {
		this.hack = hack;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
