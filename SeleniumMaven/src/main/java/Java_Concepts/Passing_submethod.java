package Java_Concepts;

public class Passing_submethod {
	int result;
	
	public void addone(int a,int b){
		result=a+b;
		System.out.println("Addition of two numbers is:"+result);
	}
	public void multi(int c,int d){
	    result=c*d;
		System.out.println("Multiplication of two numbers is:"+result);
	}
	public static void main(String[] args) {
		Passing_submethod PS=new Passing_submethod();
		PS.addone(10,20);
		PS.multi(10,5);

	}

}
