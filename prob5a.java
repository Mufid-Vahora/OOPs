import java.util.Scanner;
public class prob5a
{
    public static void main(String[] args)
    {
        float arr[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}; //Element 15 - Sum = 58; Element 16 - Average - 3.86; Element 17 - 1
        float sum=0;
        float min = 1000;
        for(int i=0;i<15;i++)
            sum+=arr[i];            //Calculating the Sum of 14 elements
        arr[15]=sum;
        arr[16]=sum/15;                 //Calculating the average of the elements
        for(int i=0;i<15;i++)           //Finding the least element
        {
            if(arr[i]<min)
                min=arr[i];
        }
        arr[17]=min;
        System.out.println("\nThe New Array is: ");
        for(int i=0;i<18;i++)
            System.out.println(arr[i]+" ");
    }
}
