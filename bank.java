import java.util.*;

class SBI
{
    float roi_Bike_sbi=10.0f;
    float roi_Car_sbi=11.0f;

    void sbi_info()
    {
        System.out.println("SBI");
        System.out.println("ROI for Bike : "+roi_Bike_sbi+"%");
        System.out.println("ROI for Car : "+roi_Car_sbi+"%");
    }
}

class ICIC extends SBI
{
    float roi_Bike_icic=13.0f;
    float roi_Car_icic=20.0f;

    void icic_info()
    {
        System.out.println("ICIC");
        System.out.println("ROI for Bike : "+roi_Bike_icic+"%");
        System.out.println("ROI for Car : "+roi_Car_icic+"%");
    }
}

class HDFC extends ICIC
{
    float roi_Bike_hdfc=15.0f;
    float roi_Car_hdfc=7.50f;

    void hdfc_info()
    {
        System.out.println("HDFC");
        System.out.println("ROI for Bike : "+roi_Bike_hdfc+"%");
        System.out.println("ROI for Car : "+roi_Car_hdfc+"%");
    }
}

class IDFC extends HDFC
{
    float roi_Bike_idfc=12.5f;
    float roi_Car_idfc=14.5f;

    void idfc_info()
    {
        System.out.println("IDFC");
        System.out.println("ROI for Bike : "+roi_Bike_idfc+"%");
        System.out.println("ROI for Car : "+roi_Car_idfc+"%");
    }
}

class compare extends IDFC
{
    void min_bike_comp() {
        float min_ab = (roi_Bike_sbi < roi_Bike_icic) ? roi_Bike_sbi : roi_Bike_icic;
        float min_cd = (roi_Bike_hdfc < roi_Bike_idfc) ? roi_Bike_hdfc : roi_Bike_idfc;
        float min_bike = (min_ab < min_cd) ? min_ab : min_cd;

        System.out.println("Minimum ROI for bike : "+min_bike);
    }

    void min_car_comp() {
        float min_ab = (roi_Car_sbi < roi_Car_icic) ? roi_Car_sbi : roi_Car_icic;
        float min_cd = (roi_Car_hdfc < roi_Car_idfc) ? roi_Car_hdfc : roi_Car_idfc;
        float min_Car = (min_ab < min_cd) ? min_ab : min_cd;

        System.out.println("Minimum ROI for Car : "+min_Car);
    }
}

public class bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cho=0;
        while(cho!=7) 
        {
            System.out.println("\n1. To get info about SBI");
            System.out.println("2. To get info about ICIC");
            System.out.println("3. To get info about HDFC");
            System.out.println("4. To get info about IDFC");
            System.out.println("5. To get best ROI for Bike");
            System.out.println("6. To get best ROI for Car");
            System.out.println("7. Exit (Press 0 to Exit)");
            System.out.print("\nEnter your choice : ");
            cho=sc.nextInt();
            
            IDFC id = new IDFC();
            compare comp = new compare();
            
            switch(cho)
            {
                case 1 : id.sbi_info();
                         break;

                case 2 : id.icic_info();
                         break;

                case 3 : id.hdfc_info();
                         break;

                case 4 : id.idfc_info();
                         break;

                case 5 : comp.min_bike_comp();
                         break;

                case 6 : comp.min_car_comp();
                         break;

                case 7 : break;

                default :  System.out.println("Invalid Input Choose Between 1 to 7!!!\n");
                            break;
            }
        }
        
    }
}
