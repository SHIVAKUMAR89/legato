import java.util.Scanner;

public class ReverseArrayString {
		    		public static void main(String args[])
		    		   {
		    		      int a[]= {1,2,3,4};
		    		      int n=0,t;    
		    		      for(int i=0;i<a.length-1-i;i++) {
		    		    	  t=a[i];
		    		    	  a[i]=a[n-i];
		    		    	  a[n-i]=t;
		    		    	  System.out.println("Rverese is"+a[i]);
		    		      }
		    		      }
}
