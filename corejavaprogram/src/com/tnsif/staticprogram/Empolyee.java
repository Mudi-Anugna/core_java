package com.tnsif.staticprogram;

public class Empolyee {
	int eid;
	String name;
    static String companyname="TCS";
    Empolyee(int r, String n){
    	eid=r;
    	name=n;
    }
    void display() {
    	System.out.println(eid+""+name+"+companyname");
    }
	public static void main(String[] args) {
		Empolyee e1=new Empolyee(1, "anu");
		Empolyee e2=new Empolyee(2, "sindhu");
		Empolyee e3=new Empolyee(3, "abhi");
		e1.display();
		e2.display();
		e3.display();
				// TODO Auto-generated method stub

	}

}
