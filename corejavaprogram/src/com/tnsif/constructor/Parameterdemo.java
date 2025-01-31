package com.tnsif.constructor;

public class Parameterdemo {
	Parameterdemo(){
		System.out.println("default");
	}
	Parameterdemo(int a ){
		System.out.println("1 parameter");
	}
	Parameterdemo(int a,String b ){
		System.out.println("2 parameter");
	}

	public static void main(String[] args) {
		Parameterdemo d=new Parameterdemo();
		Parameterdemo d1=new Parameterdemo(1,"anu");
		Parameterdemo d2=new Parameterdemo(7);
		// TODO Auto-generated method stub

	}

}
