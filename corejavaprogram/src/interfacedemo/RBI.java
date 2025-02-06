package interfacedemo;

public class RBI implements Bank{

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 9.7f;
	}
	public static void main(tring[]args) {
		Bank b=new RBI();
		System.out.println("get rate of intreent"+b.rateofinterest());
	}
	

}
