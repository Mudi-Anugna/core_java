package com.tnsif.inheritancedemo;

public class Child extends Father{
	String cycle="pink";
  public static void Main(String[]aRGS) 
  {
	Child c=new Child();
	System.out.println(c.money);
	System.out.println(c.car);
	System.out.println(c.cycle);
	c.drinking();
}

}
