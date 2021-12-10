import java.util.Random;

class Medicine{
    public void display(){
        System.out.print("Companies Name - RKM Medicines.\n");
        System.out.print("The company is located in Raipur.\n");
    }
}
class Tablet extends Medicine
{
    public void display()
    {
        super.display();
        System.out.println("Tablets are stored in cool and dry places.\n");
    }
}
class Syrup extends Medicine
{
    public void display()
    {
        super.display();
        System.out.println("Syrups are concentrated solution of sugar that are mixed in water or any other aqueous liquid.\n");
    }
}
class Ointment extends Medicine
{
    public void display()
    {
        super.display();
        System.out.println("Ointments are only used for external use.\n");
    }
}
public class prob8d         //Class TestMedicine
{
    public static void main(String[] args)
    {
        Medicine med[]=new Medicine[10];
        Random ran=new Random();
        for(int i=0;i<5;i++){
            int r=1+ran.nextInt(3);
            if(r==1)
                med[i]=new Tablet();
            else if(r==2)
                med[i]=new Syrup();
            else
                med[i]=new Ointment();
        }
        for(int i=0;i<5;i++)
            med[i].display();
    }
}
