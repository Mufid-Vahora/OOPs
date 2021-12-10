import java.util.*;
class Record
{
    public String name[];
    public int rnk[];
    Record(){
        name=new String[5];
        rnk=new int[5];
    }
    void readvalues(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter Student Name:");
            name[i]=sc1.nextLine();
            System.out.print("Enter Student Rank:");
            rnk[i]=sc.nextInt();
        }
    }
    void display(){
        for(int i=0;i<5;i++)
            System.out.println("NAME: "+name[i]+"\t\tRANK: "+rnk[i]);
    }
}
class Rank extends Record
{
    int index,a=0;
    Rank()
    {
        this.index=0;
    }
    void highest()
    {
        super.readvalues();
        for (int i = 0; i < 5; i++)
        {
            if (rnk[i] < rnk[this.index])
                this.index = i;
        }
    }
    void display()
    {
        super.display();
        System.out.println("Student with Highest Rank:");
        System.out.println("NAME: "+name[index]+"\t\tRANK: "+rnk[index]);
    }
}
public class prob8f 
{
    public static void main(String[] args)
    {
        Rank ran=new Rank();
        ran.highest();
        ran.display();
    }
}
