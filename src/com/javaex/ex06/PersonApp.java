package com.javaex.ex06;

public class PersonApp {

	public static void main(String[] args) {
		Person p1=new Person("신근섭",25);
		System.out.println(p1);
		
		Student s1= new Student("서울");
		System.out.println(s1);
		
		s1.showInfo();
		
		Person ps=new Student("이효리",40,"세주");
		ps.showInfo();
				
		((Student)ps).getSchool();

	}

}
