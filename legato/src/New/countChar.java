package New;

public class countChar {
	static int i,c=0,res;
	static int charcount(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
				c++;
			
		}
		return c;
	}
		
	public static void main(String[] args) {
		/*String s="hello iiht";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!='s')
			*/
		
		
		res=countChar.charcount("My name is khan and I am not a terrorist");
			System.out.println("the no of character\n"+res);
				
		}
	}


