package New;

public class Countcharacter {
	public static void main(String[] args) {
		
	String str="welcome to legato t 54";
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		
	//if(str.charAt(i)!=' ') 
		//if(Character.isDigit(str.charAt(i)))
			if(Character.isAlphabetic(str.charAt(i)))
	{
		count++;
	}
		
}
			System.out.println(count);
				
		}
}

