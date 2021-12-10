import java.util.Scanner;

class Ascii
{
	public static void main (String args[])
	{
		//For A-Z
		char Capitalchar = 'A';
		char Smallchar= 'a';
		
		for(int i='A';i<'Z';i++)
		{
			System.out.println(Capitalchar +" : "+i);
			Capitalchar++;
		}
		
		//For a-z;
		for(int i='a';i<'z';i++)
		{
			System.out.println(Smallchar +" : "+i);
			Smallchar++;
		}
	}
}