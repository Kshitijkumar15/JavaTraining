

import java.util.*;

class Ai {
    void intake() {
        System.out.println("1250 intake");
    }
}

class Cse extends Ai {
    void intake() {
        System.out.println("1600 intake");
    }
}

class Ise extends Cse {
    void intake() {
        System.out.println("199 intake");
    }
}

public class Presidency {
    public static void main(String[] args) {
        int ch=0;
        System.out.println("Enter choice");
        System.out.println("1 for Ai :" +"  " + "2 for Cse:" + " "+ "3 for Ise:");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        
        System.out.println(" ");
        Ai obj1 = new Ai();
       
        Ai obj2 = new Cse();
        
        Ai obj3 = new Ise();
       
        
        switch(ch){
            case 1:  System.out.println("ai branch intakes are");
             obj1.intake();
            break;
            case 2:  System.out.println("Cse branch intakes are");
            obj2.intake();
            break;   
            case 3:  System.out.println("Cse branch intakes are");
             obj3.intake();
            break;
            default: System.out.println("invalid branch");
        }
    }
}

