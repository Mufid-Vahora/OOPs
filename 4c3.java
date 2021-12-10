import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int n;
	boolean isPrime=true;
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter any number:");
	int num=scan.nextInt();
        
	for(int i=2;i<=num/2;i++)
	{
           n=num%i;
	   if(n==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	//If isPrime is true then the number is prime else not
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}