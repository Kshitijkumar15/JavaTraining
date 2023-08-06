import java.util.*;

public class days_in_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Week_day[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter today's day (Mon as 1,Tue as 2 ....  Sun as 7) : ");
        int Today_day = sc.nextInt();
        System.out.println("Enter the number of days : ");
        int num = sc.nextInt();

        int e_day= num%7;
        int n_day= (e_day + Today_day)%7;

        System.out.println("After "+num+" day is "+Week_day[n_day-1]);
    }
}
