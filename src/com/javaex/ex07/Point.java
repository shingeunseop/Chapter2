package com.javaex.ex07;

public class Point implements Drawable{
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void draw() {
		System.out.println("점을 그렸습니다. [x="+x+"y="+y+"]");
	}

}
