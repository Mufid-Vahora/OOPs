import java.util.Scanner;
class Term {
    int coef;
    int exp;
}

class Polynomial{
    Term[] t=new Term[5];
  static int i;
    Polynomial()
    {
        for(int j=0;j<5;++j)
        {
		t[j]=new Term();	
            t[j].coef=0;
            t[j].exp=0;
        }
        i=0;

    }
    void Setterm(int a, int b)		//function sets the values
    {
        int j=i;
        while(j>=0)
        {
            if(t[j].exp==b)
            {
                System.out.println("You have already used this exponent");
                return;
            }
		j=j-1;
        }
        if(j==5)
        {
            System.out.println("Size limit");
            return;
        }
        if(b<0)
        {
            System.out.println("Negative exponent is not allowed");
            return;
        }
        t[i].coef=a;
        t[i].exp=b;
	sort();
 System.out.println("done");
        i++;
    }
    void sort()
    {
        for(int j=0;j<=i;++j)
        {
            for(int k=j;k<=i;++k)
            {
                if(t[j].exp<t[k].exp)
                {
                    int temp=t[j].exp;
                    t[j].exp=t[k].exp;
                    t[k].exp=temp;
                }
            }
        }
    }
    void display()
    {
	System.out.print("Polynomial is:");
        for(int j=0;j<i;++j)
        {
            System.out.print(t[j].coef + "x^(" + t[j].exp + ") ");
	    if(j<i-1)
		System.out.print("+ ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Polynomial p=new Polynomial();
        char ch;
        do
        {
            System.out.print("Enter the coefficient of the polynomial:");
            int c=sc.nextInt();
            System.out.print("Enter the exponent of the polynomial:");
            int e=sc.nextInt();
            p.Setterm(c,e);
            System.out.print("Do you want to continue:");            
            ch=sc.next().charAt(0);
        }while(ch=='y');
        p.display();
    }
}
