import java.util.Scanner;
public class ReverceString {
	    public static void main(String[] args)
	    {
	        
	        //Scanner scan = new Scanner(System.in);
	        String str="IIHT";
	        String rev = "";
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	           rev+= str.charAt(i);
	        }
	        
	      str=rev;
	     
	        System.out.println(rev);
	        
	    }
}
	
