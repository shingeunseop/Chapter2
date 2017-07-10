package com.javaex.ex02;

public class GoodsApps {

	public static void main(String[] args) {
		
		Goods cup= new Goods("허브",500);
		cup.showInfo();
		
		Goods pc=new Goods("LG그램",9000);
		pc.showInfo();
		
		Goods camera=new Goods("니콘",5000);
		camera.showInfo();
		
		/*Goods camera= new Goods();
		camera.setName("니콘");
		String n=camera.getName();
		camera.setPrice(400000);
		int m=camera.getPrice();
		camera.showInfo();
		
		Goods electro=new Goods();
		electro.setName("LG그램");
		String n1=electro.getName();
		electro.setPrice(900000);
		int m1=electro.getPrice();
		electro.showInfo();
		
		Goods cup=new Goods();
		cup.setName("머그컵");
		String n2=cup.getName();
		cup.setPrice(2000);
		int m2=cup.getPrice();
		cup.showInfo();
		*/

	}

}
