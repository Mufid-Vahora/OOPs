import java.util.Scanner;

public class Even_Odd{
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.print("Enter the Number: ");
		n= sc.nextInt();
		
		if(n%2==0){
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is Odd");
		}
		
	
	}
}