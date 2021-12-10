import java.util.Scanner;
public class prob5c
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,m,x,y;

        System.out.print("Enter Rows for Matrix 1(max 10): ");
        n = sc.nextInt();
        System.out.print("Enter Columns for Matrix 1(max 10): ");
        m = sc.nextInt();
        System.out.print("Enter Rows for Matrix 2(max 10): ");
        x = sc.nextInt();
        System.out.print("Enter Columns for Matrix 2(max 10): ");
        y = sc.nextInt();

        int mat1[][],mat2[][],add[][],mult[][];
        mat1 = new int[n][m];
        mat2 = new int[x][y];
        add = new int[10][10];
        mult = new int[10][10];

        System.out.print("\nEnter elements for Matrix 1:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                mat1[i][j] = sc.nextInt();
        }
        System.out.print("\nMatrix 1: \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(mat1[i][j]+" ");
            System.out.println();
        }

        System.out.print("\nEnter elements for Matrix 2:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nMatrix 2: \n");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
                System.out.print(mat2[i][j]+" ");
            System.out.println();
        }

        System.out.print("\nThe addition matrices is:\n");
        if(n==x && m==y)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    add[i][j]=mat1[i][j]+mat2[i][j];
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("The two matrices can't be added.");

        System.out.print("\nThe multiplied matrix is:\n");
        if(m==x)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<y;j++)
                {
                    mult[i][j]=0;
                    for (int k = 0; k < m; k++)
                        mult[i][j] += mat1[i][k] * mat2[k][j];
                    System.out.print(mult[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("The two matrices can't be multiplied.");
    }
}
