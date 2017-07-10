package com.javaex.ex07;

public class ShapeApp {

	public static void main(String[] args) {
		
		Drawable[] dArr=new Drawable[8];
		
		Drawable r01=new Rectangle("빨강","빨강",4,4);
		Drawable r02=new Rectangle("노랑","노랑",10,10);
		Drawable c01=new Circle("빨강","빨강",4);
		Drawable c02=new Circle("노랑","노랑",10);
		Drawable t01 =new Triangle("초록","초록",14,33);
		Drawable t02 =new Triangle("주황","주황",10,33);
		Drawable p01=new Point(1,1);
		Drawable p02=new Point(10,10);
		
		dArr[0]=r01;
		dArr[1]=r02;
		dArr[2]=c01;
		dArr[3]=c02;
		dArr[4]=t01;
		dArr[5]=t02;
		dArr[6]=p01;
		dArr[7]=p02;
		
		for(int i=0;i<dArr.length;i++) {
			dArr[i].draw();
		}
		for(int i=0;i<dArr.length;i++) {
			shapeArea(sArr[i]);
		}
		

	}
	public static void shapeArea(Drawble d) {
		if(d instanceof Shape) {
			
		}
		double area=s.area();
		System.out.println("도형의 넓이는 "+area+"입니다.");
	}

}
