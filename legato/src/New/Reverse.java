package New;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	   {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String u=scan.nextLine();
		for(int i=0;i<u.length();i++)
		{char letter=u.charAt(i);
		System.out.println(letter);
		}

	}
}

