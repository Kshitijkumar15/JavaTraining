import java.util.*;

public class Transpose_Matrix {
    public static void main(String args[]) {
        int i, j, r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row matrix : ");
        r = sc.nextInt();
        System.out.println("Enter the no. of Column matrix : ");
        c = sc.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter " + r * c + " values of Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix : ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
