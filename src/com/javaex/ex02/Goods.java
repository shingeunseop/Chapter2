package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	private static int count;
	
	public Goods() {//���������� �� �̷� ������ ����.
		
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
		this(name);//���� ������ �����, �� ������ �;���
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
			System.out.println("��ǰ�� �����ϴ�.");
	}
	
	
	/*private String name;
	private int price;
	
	public void setName(String name) {this.name=name;	}
	public String getName() {return name;}
	public void setPrice(int price) {this.price=price;}
	public int getPrice() {	return price;}
	
	
	public void showInfo() {
		System.out.println("��ǰ�̸� : "+name);
		System.out.println("���� : "+price);
		System.out.println("");
	}*/

}
