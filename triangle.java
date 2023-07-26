import java.util.*;

class equilateral {

    void equi(int a, int b, int c) {
        if (a == b && b == c && c == a) {
            System.out.println("It is Equilateral Triangle");
        }
    }
}

class isosceles extends equilateral {
    void iso(int a, int b, int c) {
        if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
            System.out.println("It is Isosceles Triangle");
        }
    }
}

class scalene extends isosceles {
    void scal(int a, int b, int c)
    {
        if(a!=b && b!=c && c!=a)
        {
            System.out.println("It is Scalene Triangle");
        }
    }
}

public class triangle extends scalene {     //Here without "extends scalene" it will work
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle : ");
        a = sc.nextInt();
        System.out.println("Enter the second side of the triangle : ");
        b = sc.nextInt();
        System.out.println("Enter the third side of the triangle : ");
        c = sc.nextInt();

        scalene s = new scalene();
        s.equi(a,b,c);
        s.iso(a,b,c);
        s.scal(a,b,c);
    }
}

