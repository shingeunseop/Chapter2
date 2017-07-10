package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	private static int count;
	
	public Goods() {//내부적으로 빈 이런 문법이 있음.
		
	}
	
	
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
		count=count+1;
	}
	public Goods(String name) {
		this.name=name;
	}
	
	public Goods(int price) {
		this("",price);
	}
	
	
	
	
	
	public Goods(int count, String name ) {
		this(name);//위의 네임을 사용함, 단 맨위에 와야함
		this.price=price;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println(name+"  "+price+" "+count);
	}
	
	public void showInfo(boolean boo) {
		if(boo) {
			System.out.println(name+"  "+price);
		}else
			System.out.println("상품이 없습니다.");
	}
	
	
	/*private String name;
	private int price;
	
	public void setName(String name) {this.name=name;	}
	public String getName() {return name;}
	public void setPrice(int price) {this.price=price;}
	public int getPrice() {	return price;}
	
	
	public void showInfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("");
	}*/

}
