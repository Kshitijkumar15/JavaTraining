import java.util.*;

public class Condition_2d_Array {
    public static void main(String args[]) {
        int i, j, r1, c1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row matrix : ");
        r1 = sc.nextInt();
        System.out.println("Enter the no. of Column matrix : ");
        c1 = sc.nextInt();

        int a[][] = new int[r1][c1];

        System.out.println("Enter "+r1*c1+" values of Matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                if(a[i][j]==0)
                {
                    System.out.println("Enter the value of again for a["+i+"]["+j+"] as it can't be zero : ");
                    a[i][j]=sc.nextInt();
                }
            }
        }

        System.out.println("Matrix after Updation : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
