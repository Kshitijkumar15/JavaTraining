import java.util.*;

public class time_and_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("In how many days Person A complete work : ");
        float a = sc.nextInt();

        System.out.print("\nIn how many days Person B complete work : ");
        float b = sc.nextInt();

        System.out.print("\nEnter for how many days they worked together :");
        int num =  sc.nextInt();

        float together = (((1/a)+(1/b))*num)*100;

        System.out.println("\nWork Completed by them in "+num+" days :"+together+" %");
    }
}
