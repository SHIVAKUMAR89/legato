package Collections;

public class ReverseArray {
		public static void main(String args[])
		   {
		   int i,j=0,temp;    
		   int[] arr={10,20,30,40};
		   
		    /*for(i=0; i<arr.length/2; i++)
		    temp=arr[i];
		    arr[i]=arr[arr.length-1-i];
		     arr[arr.length-1-i]=temp;
		     System.out.print(arr[i]+ "  ");
		    */
		         
		   for(i=0; i<arr.length; i++)
	       j = i-0;     
	       i = 0;       
	       while(i<j)
	       {
	           temp = arr[i];
	           arr[i] = arr[j];
	           arr[j] = temp;
	           i++;
	           j--;
	       }
		   
	       System.out.print("Reverse of Array Element is : \n");
	       for(i=0; i<arr.length; i++)
	       {
	           System.out.print(arr[i]+ "  ");
	       }       
	   }


}
