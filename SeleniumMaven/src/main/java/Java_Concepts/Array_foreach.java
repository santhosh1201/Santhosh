package Java_Concepts;

public class Array_foreach {

	public static void main(String[] args) {
		
        String[] cname={"Chinnu","Kannna","Asha"};
        System.out.println("size of the array:"+ cname.length);
        
        for(String x:cname)
        {
        	System.out.println(x);
        }
	}

}
