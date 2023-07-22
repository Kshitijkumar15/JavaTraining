import java.util.*;
public class emi{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the Principle Amount : ");
        int p=sc.nextInt();
        System.out.print("\nRate of Intrest : ");
        float r=sc.nextFloat();
        System.out.print("\nTenure in years: ");
        int t=sc.nextInt();
        
        float emi,t_Int,t_Amt;
        t_Int=(p*r*t)/100;
        t_Amt=p+t_Int;
        emi=t_Amt/(t*12);
        
        System.out.println("\nEMI : "+ emi);
        System.out.println("\nTotal Amount paid : "+ t_Amt);
        System.out.println("\nTotal Intrest Paid : " + t_Int);
    }
}