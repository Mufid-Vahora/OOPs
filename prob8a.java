
abstract class Instrument
{
    abstract void play();
}
class Flute extends Instrument
{
    void play()
    {
        System.out.println("Flute is playing toot toot toot..");
    }
}
class Piano extends Instrument
{
    void play()
    {
        System.out.println("Piano is playing tan tan tan..");
    }
}
class Guitar extends Instrument
{
    void play()
    {
        System.out.println("Guitar is playing tin tin tin..");
    }
}
public class prob8a
{
    public static void main(String[] args)
    {
        Random ran=new Random();
        Instrument object[]=new Instrument[10];
        for(int i=0;i<10;i++)
        {
            int r=ran.nextInt(3);
            if(r==0)
                object[i]=new Flute();
            else if(r==1)
                object[i]=new Piano();
            else if(r==2)
                object[i]=new Guitar();
        }
        for(int i=0;i<10;i++)
            object[i].play();
    }
}