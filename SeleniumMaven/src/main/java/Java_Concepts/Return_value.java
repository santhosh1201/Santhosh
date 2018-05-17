package Java_Concepts;

public class Return_value {
	
	public static String addone(int a,int b){
		int result=a+b;
		return "Addition of two numbers is:"+result;
	}
	
	public static void main(String[] args) {
		
		Return_value RV=new Return_value();
		String x=addone(10,20);
		System.out.println(x);
	} 
}
