package com.tnsif.superkeyword;

public class Childdemo extends Parentdemo {
	int a=17;
	void drink() {
		System.out.println("coffe");
	}
	void display() {
		//System.out.println(a);
	//	System.out.println(super.a);
		drink();
		super.drink();
		
	}
	 public static void main(String args) {
		 Childdemo d=new Childdemo();
		 d.display();
	 }
	

}
