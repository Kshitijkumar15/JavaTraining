import java.util.*;

public class days_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Week_day[] = new String[]{"MON", "TUE", "WED", "THUR", "FRI", "SAT", "SUN"};

        System.out.println("Enter today's day (MON, TUE, WED, THUR, FRI, SAT, SUN) : ");
        String Today_day = sc.next();

        System.out.println("Enter the number of days : ");
        int num = sc.nextInt();

        int day_in_int=0;
        for(int i=0; i<7; i++)
        {
            if(Week_day[i].equalsIgnoreCase(Today_day))
            {
                day_in_int=i+1;
                break;
            }
        }
        
        int e_day= ((num%7) + day_in_int)%7;
        System.out.println("After "+num+" day is "+Week_day[e_day-1]);
    }
}
