package Collections;
import java.util.*;

public class ArrayListSort {

		public static void main(String args[]){
		   List<String> al = new LinkedList<String>();
		   al.add("India");
		   al.add("US");
		   al.add("China");
		   al.add("Denmark");
		   
		   for(int i=0;i<al.size();i++){
			   String temp=al.get(i);
			   al.set(i,al.get(al.size()-1-i));
			   al.set(al.size()-1-i,temp);
			   
		   }
		   int i=0;
		System.out.println(al.get(i));
		  al.get(i);
		  //al.set(i,);
		   /*System.out.println("Before Sorting:");
		   for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}

		   Collections.sort(al);

		   System.out.println("After Sorting:");
		   for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}*/
		}
	}

