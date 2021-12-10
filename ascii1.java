import java.util.Scanner;

class Ascii
{
	public static void main (String args[])
	{
		//For a single Character
		char ch;
		
		System.out.println("Enter any character: ");
		Scanner c = new Scanner(System.in);
		ch = c.next().charAt(0);
		
		int a=ch;
		System.out.print("Ascii value of "+ch+"is "+a);
	}
}