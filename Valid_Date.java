import java.util.*;
public class Valid_Date {
    public static void main(String args[])
    {
        int a[] = new int[3];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Date : ");
            a[0]=sc.nextInt();
            System.out.print("Enter Month : ");
            a[1]=sc.nextInt();
            System.out.print("Enter Year : ");
            a[2]=sc.nextInt();
        }
        if((a[0]>0 && a[0]<=31) && (a[1]==1 || a[1]==3 || a[1]==5 || a[1]==7 || a[1]==8 || a[1]==10 || a[1]==12) && (a[2]>999 && a[2]<10000))
        {
            System.out.println("Given date is Valid");
        }
        else if((a[0]>0 && a[0]<=30) && (a[1]==4 || a[1]==6 || a[1]==9 || a[1]==11) && (a[2]>999 && a[2]<10000))
        {
            System.out.println("Given date is Valid");
        }
        else if((a[1]==2) && (a[0]>0 && a[0]<=29) && (a[2]%4==0) )
        {
            System.out.println("Given date is Valid");
        }
        else if((a[1]==2) && (a[0]>0 && a[0]<29) && (a[2]%4==1) )
        {
            System.out.println("Given date is Valid");
        }
        else
        {
            System.out.println("Given date is NOT Valid!!!!!");
        }
    }
}
