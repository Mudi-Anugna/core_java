package com.tnsif.constructor;

public class Customer {
	private String Customername;
	private int Customerid;
	private String Customeraddress;
	Customer(){
		System.out.println("default");
	}
	public Customer(String Customername, int Customerid, String Customeraddress) {
		super();
		this.Customername = Customername;
		this.Customerid = Customerid;
		this.Customeraddress = Customeraddress;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String Customername) {
		Customername = Customername;
	}
	public int getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(int Customerid) {
		this.Customerid = Customerid;
	}
	public String getCustmoeraddress() {
		return Customeraddress;
	}
	public void setCustmoeraddress(String Custmoeraddress) {
		this.Customeraddress = Custmoeraddress;
	}
	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", Customerid=" + Customerid + ", Custmoeraddress="
				+ Customeraddress + "]";
	}
	
}
