import java.util.*;
class Car
{
    double speed,gear;
    public void drive()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the initial value of speed of car: ");
        speed = ob.nextDouble();
        System.out.print("Enter the initial value of the gear of car: ");
        gear = ob.nextInt();
    }
    public void display()
    {
        System.out.println("The Speed of car is "+speed+"."+"\nNumber of gears "+gear+".");
    }
}
class SportCar extends Car
{
    int AirBalloonType;
    public void drive()
    {
        Scanner ob = new Scanner(System.in);
        super.drive();
        System.out.print("Enter the AirBalloonType: ");
        AirBalloonType=ob.nextInt();

    }
    public void display()
    {
        super.display();
        System.out.println("Sports Car are of Air Balloon Type:"+this.AirBalloonType);
    }
}
public class prob8e
{
    public static void main(String[] args)
    {
        SportCar sc=new SportCar();
        sc.drive();
        sc.display();
    }
}
