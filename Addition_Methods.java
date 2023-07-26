import java.util.*;

public class Addition_Methods 
{
    public static void main(String[] args) 
    {
        Addition_Methods myObj = new Addition_Methods(); 
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        a=sc.nextInt();
        System.out.println("Enter Second Number : ");
        b=sc.nextInt();
        myObj.add(a,b);
        
    }
    public void add(int a,int b)
    {
        
        int sum=a+b;
        System.out.println("Addition : "+sum);
    }
}
