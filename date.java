import java.util.Scanner;

class Date
{
	public static void main (String args[])
	{
		Scanner d = new Scanner(System.in);
		int dd,mm,y;
		
		
		System.out.println("Enter your name: ");
		String name=d.next();
		System.out.println("Enter your date in date/month/year: ");
		
		dd = d.nextInt();
		mm = d.nextInt();
		y = d.nextInt();
		
		System.out.println("Your Birthday is on "+dd+"/"+mm+"/"+y);
		
		
		
	}
}