import java.util.*;
public class Dynamic_Condition_Zero {
    public static void main(String args[]) {
        int i, j, r1, c1,temp;
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
                temp=sc.nextInt();
                if(temp!=0)
                {
                    a[i][j]=temp;
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Value can't be Zero!!! Enter non-zero value : "); 
                        temp=sc.nextInt();
                         if(temp!=0)
                         {
                            a[i][j]=temp;
                            break;
                         }
                    }
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
