import java.util.*;

public class Sum_2d_Array {
    public static void main(String args[]) {
        int i,j, r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the no. of row First matrix : ");
            r1 = sc.nextInt();
            System.out.println("Enter the no. of Column First matrix : ");
            c1 = sc.nextInt();

            System.out.println("Enter the no. of row Second matrix : ");
            r2 = sc.nextInt();
            System.out.println("Enter the no. of Column Second matrix : ");
            c2 = sc.nextInt();

            if (r1 == r2 && c1 == c2) {
                
                break;
            }
            else 
            System.out.println(
                        "Number of Rows and column should be same for both matrix!!!!! Enter the value again");
        }
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int c[][] = new int[r1][c1];
        
        System.out.println("Enter "+r1*c1+" values of First Matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter "+r2*c2+" values of Second Matrix : ");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                c[i][j]= a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of the array");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
