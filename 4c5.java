import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter two numbers: ");
		a= s.nextInt();
		b= s.nextInt();
		System.out.println("****************************************");
		System.out.println("For Addition: 	    1");
		System.out.println("For Subtration:     2");
		System.out.println("For Multiplication: 3");
		System.out.println("For Division(a/b):  4");
		System.out.println("For Modulus(a%b):   5");
		
		
		
		int choice;
		System.out.println("Enter your choice: ");
		choice =s.nextInt();
		
		switch(choice){
			
			case 1:
			System.out.println(+(a+b));
			break;
			
			case 2:
			System.out.println(+(a-b));
			break;
			
			case 3:
			System.out.println(+(a*b));
			break;
			
			case 4:
			System.out.println(+(a/b));
			break;
			
			case 5:
			System.out.println(+(a%b));
			break;
			
			default:
			System.out.println("Enter a Valid Choice");
			
			
			
		}
		
	}
}