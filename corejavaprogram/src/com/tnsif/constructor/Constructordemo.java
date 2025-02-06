package com.tnsif.constructor;
import java.util.Scanner;
public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
         String name=sc.next();
         System.out.println(" enter the customer id");
         int id=sc.nextInt();
         System.out.println("enter the customer address");
         String address=sc.next();
         Customer c= new Customer();
         c.setCustomername(name);
         c.setCustomerid(id);
         c.setCustmoeraddress(address);
         System.out.println(c);
         boolean output= c instanceof Customer;
         System.out.println(output);
	}

	}


