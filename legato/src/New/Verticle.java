package New;

import java.util.Scanner;

public class Verticle {
		public static void main(String args[])
		   {
			int count=0;
			int i;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a string");
			String u=scan.nextLine();
			String str=new String();
			for( i=0;i<u.length();i++)
				if(str.charAt(i)=='i'){
					count=count+1;
				}
			{char letter=u.charAt(i);
			System.out.println(letter+","+count);

			}
			count=0;

		}
	}


