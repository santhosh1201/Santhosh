package Java_Concepts;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		
		try{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		  catch(Exception e)
		{
			System.out.println("b value cannot be zero");
			System.out.println(e);
		}
			finally
			{
				System.out.println("It is an example of try catch");
			}
			
		}

	}