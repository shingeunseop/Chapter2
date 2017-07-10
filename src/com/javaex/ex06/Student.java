package com.javaex.ex06;

public class Student extends Person{
	
	private String school;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String school) {
		super(name,age);
		/*this.setName(name);
		this.setAge(age); 부모가 먼저 세팅되고나서 자식값을 넣어야함*/
		this.setSchool(school);
	}

	public Student(String school) {
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public void showInfo() {
		System.out.println("name" + super.name 
				+ "age:" + super.age+
				"school:"+school);
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}
	

}
