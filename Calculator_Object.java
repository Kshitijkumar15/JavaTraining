import java.util.Scanner;

public class Calculator_Object {
    public static void main(String[] args) {
        Calculator_Object myObj= new Calculator_Object();

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator\n\n");
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("Enter the Operator ( + , - , * , / ) : ");
        char op=sc.next().charAt(0);
        myObj.calc(a,b,op);
    }

    public void calc(int a, int b, char op) 
    {
        int result=0;
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
            case '*' :  for(int i=0;i<b;i++)
                        {
                           result=result+a; 
                        }
                        System.out.println("Multiplication of numbers : "+ result);
                        break;
            case '/' :  if(b==0)
                        {
                           System.out.println("Second number can't be zero");
                           break;
                        }
                        else
                        {
                            float div;
                            div=(float)(a/b);
                            System.out.println("Division of number is : "+ div);
                            break;
                        }
            default :   System.out.println("Invalid Input");
        }
    }
}
