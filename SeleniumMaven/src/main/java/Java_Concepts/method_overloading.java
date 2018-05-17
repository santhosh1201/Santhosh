package Java_Concepts;

public class method_overloading {
	
	public void demoOne(int a,int b){
		int c=a*b;
		System.out.println("Multiplication of given numbers is:"+c);
		
	}
	public void demoOne(String x,String y){
		String z=x+y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		method_overloading mo=new method_overloading();
		
			mo.demoOne(10, 20);
			mo.demoOne("Pra","shanth");
	

	}

}
