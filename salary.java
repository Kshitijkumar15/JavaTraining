import java.util.*;
public class salary{
    public static void main(String [] args)
    {
        float tax,sal;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter salary : ");
            sal=sc.nextInt();
        }
        if(sal>0 && sal<=500000){
            tax=0;
        }
        else if(sal>500000 && sal<=750000){
            tax=(float)(0+(sal-500000)*0.05);
            
        }
        else if(sal>750000 && sal<=1000000){
            tax=(float)(0+12500+(sal-750000)*0.1);
            
        }
        else {
            tax=(float)(0+12500+25000+(sal-1000000)*0.2);
        }
        
        System.out.println(tax);
        
    }
}