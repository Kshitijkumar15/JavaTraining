import java.util.*;

public class time_dist_speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float time,dist,speed;
        

        System.out.println("Enter what you want to find :");
        System.out.println("1.Time \n2.Distance \n3.Speed");
        System.out.print("\nEnter your choice : ");
        int cho = sc.nextInt();
        switch (cho) {
            case 1:
                System.out.print("\nEnter speed in km/h :");
                speed = sc.nextFloat();
                speed = speed*((5.0f/18.0f));

                System.out.print("\nEnter Distance in km :");
                dist = sc.nextFloat();
                dist = dist*1000;

                time=dist/speed;
                System.out.println("\nTime : " + (time/60.0f) + " minutes");
                break;

            case 2:
                System.out.print("\nEnter speed in km/h :");
                speed = sc.nextFloat();
                speed = speed*((5.0f/18.0f));

                System.out.print("\nEnter time in hour :");
                time = sc.nextFloat();
                time = time*3600.0f;

                dist= speed*time;
                System.out.println("\nDistance : " + (dist/1000.0f) + " Km");
                break;
        
            case 3:
                System.out.print("\nEnter Distance in km :");
                dist = sc.nextFloat();
                dist = dist*1000;

                System.out.print("\nEnter time in hour :");
                time = sc.nextFloat();
                time = time*3600.0f;

                speed = dist/time;
                speed = speed*(18.0f/5.0f);
                System.out.println("\nSpeed : " + speed + " Km/h");
                break;
            default:
                System.out.println("Invalid Input!!!!!");
                break;
        }
    }
}
