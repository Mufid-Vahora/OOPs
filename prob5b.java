import java.util.Scanner;
public class prob5b
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,temp;

        System.out.print("Enter number of Array Elements: ");
        n = sc.nextInt();

        int arr[];
        arr = new int[n];

        System.out.println("Enter n elements in array:");

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++)        //Arranging the Array in Ascending Order
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nArray in ascending order:");
        for(int i=0;i<n;i++)
            System.out.print(" "+arr[i]);

        for(int i=0;i<n;i++)        //Arranging the Array in Descending Order
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nArray in descending order:");
        for(int i=0;i<n;i++)
            System.out.print(" "+arr[i]);
    }
}