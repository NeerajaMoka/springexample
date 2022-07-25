package com.wipro.training.model;

public class Student {
private int roll;
private String name;
private float marks;
private String city;
public Student() {
	super();
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public Student(int roll, String name, float marks, String city) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.city = city;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
