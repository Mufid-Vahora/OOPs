import java.util.*;
abstract class Compartment
{
    abstract void notice();
}
class FirstClass extends Compartment
{
    void notice()
    {
        System.out.println("This is the First Class Compartment.");
    }
}
class Ladies extends Compartment
{
    void notice()
    {
        System.out.println("This is the Ladies Compartment.");
    }
}
class General extends Compartment
{
    void notice()
    {
        System.out.println("This is the General Compartment.");
    }
}
class Luggage extends Compartment
{
    void notice()
    {
        System.out.println("This is the Luggage Compartment.");
    }
}

public class prob8b                     //TestCompartment
{
    public static void main(String[] args)
    {
        Compartment cp[]=new Compartment[10];
        Random ran=new Random();
        for(int i=0;i<10;i++)
        {
            int r=1+ran.nextInt(4);
            if(r==1)
                cp[i]=new FirstClass();
            else if(r==2)
                cp[i]=new Ladies();
            else if(r==3)
                cp[i]=new General();
            else
                cp[i]=new Luggage();
        }
        for(int i=0;i<10;i++)
            cp[i].notice();
    }
}
