package com.javaex.ex07;

public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	/*public abstract void draw();*/
	public abstract double area();
	
	
}
