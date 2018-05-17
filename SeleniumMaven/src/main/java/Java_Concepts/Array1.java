package Java_Concepts;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] cname = new String[3];
       cname[0] = "San";
       cname[1] = "Van";
       cname[2] = "Can";
       
       System.out.println("size of an array"+cname.length);
       
       for(int i=0;i<cname.length;i++)
       {
       System.out.println(cname[i]);
       
       }
	}

}
