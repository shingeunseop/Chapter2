package com.javaex.ex07;

public class Triangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	
	public Triangle() {}
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor,lineColor);
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println("삼각형을 그렸습니다.[가로:"+width+"세로:"+height+"]");
	}
	public double area() {
		return (width*height)/2;
	}

}
