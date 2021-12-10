import java.util.*;
class Student
{
    int roll,age;
    String name;
    void getDetails(int roll,String name,int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
    }
}
class Exam extends Student
{
    float marks[]=new float[6];
    void getDetails(int roll,String name,int age,float poe,float dc,float dm,float oop,float dsa,float de)
    {
        super.getDetails(roll,name,age);
        marks[0]=poe;
        marks[1]=dc;
        marks[2]=dm;
        marks[3]=oop;
        marks[4]=dsa;
        marks[5]=de;
    }
}
class Result extends Exam
{
    float total_marks=0;
    void getDetails(int roll,String name,int age,float poe,float dc,float dm,float oop,float dsa,float de)
    {
        super.getDetails(roll,name,age,poe,dc,dm,oop,dsa,de);
        for(int i=0;i<6;i++)
            total_marks+=marks[i];
    }
    void display()
    {
        System.out.println("The Total marks of "+name+" is "+total_marks+" out of 500.0");
    }
}
public class prob8c
{
    public static void main(String[] args)
    {
        float s0,s1,s2,s3,s4,s5;
        int roll,age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name =sc.nextLine();
        System.out.print("Enter your RollNo:");
        roll= sc.nextInt();
        System.out.print("Enter your Age:");
        age= sc.nextInt();
        System.out.print("Enter your marks in POE:");
        s0= sc.nextInt();
        if(s0>100 || s0<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        System.out.print("Enter your marks in DC:");
        s1= sc.nextInt();
        if(s1>100 || s1<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        System.out.print("Enter your marks in DM:");
        s2= sc.nextInt();
        if(s2>100 || s2<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        System.out.print("Enter your marks in OOP:");
        s3= sc.nextInt();
        if(s3>100 || s3<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        System.out.print("Enter your marks in DSA:");
        s4= sc.nextInt();
        if(s4>100 || s4<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        System.out.print("Enter your marks in DE:");
        s5= sc.nextInt();
        if(s5>100 || s5<0)
        {
            System.out.println("Invalid Marks!!");
            System.exit(0);
        }
        Result r=new Result();
        System.out.print("\n*********************************************\n");
        System.out.print("\t\tREPORT CARD\n");
        r.getDetails(roll, name, age, s0, s1, s2, s3, s4, s5);
        r.display();
        System.out.print("\n*********************************************\n");
    }
}
