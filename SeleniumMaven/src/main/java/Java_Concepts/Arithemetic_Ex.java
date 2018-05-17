package Java_Concepts;

public class Arithemetic_Ex {

			int result;
		public void addone(){
			int a=10;
			int b=20;
			result=a+b;
			System.out.println("Addition of two numbers is:"+result);
		}
		public void multi(){
			int a=10;
			int b=20;
		    result=a*b;
			System.out.println("Multiplication of two numbers is:"+result);
		}
		public static void main(String[] args) {
			Arithemetic_Ex AE=new Arithemetic_Ex();
			AE.addone();
			AE.multi();

	}

}
