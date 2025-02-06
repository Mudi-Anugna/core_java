package com.tnsif.staticprogram;

public class Student {
	int rollno;
	String name;
	static String college="IIT";
	static void change() {
		college="tkr";
		
	}
	 Student(int r,String n) {
		 rollno=r;
		 name=n;
		// TODO Auto-generated constructor stub
	}
	 void display() {
		 System.out.println(rollno +" "+name +" "+college);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.change();
		Student s1=new Student(1, "anu");
		Student s2=new Student(2,"sindhu po");
		s1.display();
		s2.display();
	}

}
