package com.javaex.ex07;

public class Circle extends Shape implements Drawable{
	private int radius;
	
	public Circle() {}
	public Circle(String fillColor,String lineColor,int radius) {
		super(fillColor,lineColor);
		this.radius=radius;
	}
	public void draw() {
		System.out.println("원을 그렸습니다. [반지름:"+radius+"]");
		
	}
	public double area() {
		return radius*radius*3.18;
	}


}
