import java.util.Scanner;

public class Pattern{

    public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n;
		System.out.print("Enter the number: ");
		n= s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-i-1);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+1;k++){
			
				System.out.print(""+k);
			
			}
			System.out.println();
		}
		
	}
}