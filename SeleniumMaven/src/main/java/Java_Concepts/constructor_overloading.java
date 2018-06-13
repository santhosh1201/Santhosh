 package Java_Concepts;

public class constructor_overloading {
		
	public void consEx(int a,int b){
		int c=a*b;
		System.out.println("Multiplication of two numbers is:"+c);
	}
	public void consEx(String x,String y){
	    String z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		constructor_overloading co=new constructor_overloading();
			co.consEx(5,6);
			co.consEx("San","thosh");

	}

}
