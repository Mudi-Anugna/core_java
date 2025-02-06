package interfacedemo;

public class Demointerface1 implements Parentinterface,Childinterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

	@Override
	public void print() {
		System.out.println("print");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[]args) {
		Demointerface1 d=new Demointerface1();
		d.show();
		d.print();
	}
	

}
