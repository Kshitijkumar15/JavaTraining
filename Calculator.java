

import java.util.*;
class Calculator {
    public static void main(String[] args) {
        
        int sum=0,a,b;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator\n\n");
        System.out.println("Enter first number : ");
        a=sc.nextInt();
        System.out.println("Enter second number : ");
        b=sc.nextInt();
        System.out.println("Enter the Operator ( + , - , * , / ) : ");
        op=sc.next().charAt(0);
        switch(op)
        {
            case '+' : if(a>b)
                        {
                            System.out.println("Sum of numbers : "+ Integer.sum(a,b));
                        }
                        else
                            System.out.println("First number should be greater than second");
                        break;
            case '-' :  System.out.println("Subtraction of numbers : "+ Math.subtractExact(a,b));
                        break;
            case '*' :  for(int i=0;i<=b;i++)
                        {
                           sum=sum+a; 
                        }
                        System.out.println("Multiplication of numbers : "+ sum);
                        break;
            case '/' :  if(b==0)
                        {
                           System.out.println("Second number can't be zero");
                           break;
                        }
                        else
                        {
                            int div,rem;
                            rem=a%b;
                            div=(a-rem)/b;
                            System.out.println("Division of number is : "+ div);
                        }
        }
        
    }
}