import java.util.Scanner;

class multiple
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int i;
		i=s.nextInt();
		
		for(i=1;i<=50;i++)
		{
				if(i%3==0 && i%5==0)
			{
				System.out.println(i+" - Fizz-Bizz");
			}
			else
			{
				if(i%3==0)
				{
					System.out.println(i+" - Fizz");
				}
				else if(i%5==0)
				{
					System.out.println(i+" - Bizz");
				}
				else
				{
					System.out.println(i+" - ");
				}
			}
	
		
		}
	}
}
		