package com.javaex.ex07;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArr=new Shape[6];
		
		Shape r01=new Rectangle("빨강","빨강",4,4);
		Shape r02=new Rectangle("노랑","노랑",10,10);
		Shape c01=new Circle("빨강","빨강",4);
		Shape c02=new Circle("노랑","노랑",10);
		Shape t01 =new Triangle("초록","초록",14,33);
		Shape t02 =new Triangle("주황","주황",10,33);
		
		sArr[0]=r01;
		sArr[1]=r02;
		sArr[2]=c01;
		sArr[3]=c02;
		sArr[4]=t01;
		sArr[5]=t02;
		
		for(int i=0;i<sArr.length;i++) {
			sArr[i].draw();
		}
		

	}

}
