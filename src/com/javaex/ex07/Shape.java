package com.javaex.ex07;

public class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	public void draw() {
		System.out.println("그릴 수 없다.");
	}

}
