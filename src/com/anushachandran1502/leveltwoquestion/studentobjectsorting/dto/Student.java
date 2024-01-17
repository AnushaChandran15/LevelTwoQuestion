package com.anushachandran1502.leveltwoquestion.studentobjectsorting.dto;

public class Student implements Comparable<Student> {
	private static int id=1;
	private String name;
	private String[] dob;
	private byte age;
	public Student(String name, String[] dob) {
		this.name=name;
		this.dob=dob;
	}
	public Student() {
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
	public String[] getDob() {
		return dob;
	}
	public void setDob(String[] dob) {
		this.dob = dob;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student std) {
		return name.compareToIgnoreCase(std.getName());
	}
	
	
}
