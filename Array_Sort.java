import java.util.*;
public class Array_Sort {
    public static void main(String args[])
    {
        int a[]={2,5,3,1,6,0,9,7};
        int n=a.length;
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j+1]>a[j])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
