import java.util.*;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deposit, withdraw, balance = 15000, withdraw_bal=0;
        int pre_bal[] = new int[10];
        int cur_bal[] = new int[10];
        int index = 0;
        int cho = 0;

        while (cho != 5) {
            System.out.println("\nATM \n\n1. Deposit \n2. Withdraw \n3. Mini Statement \n4. Balance Enquiry \n5. Exit");
            System.out.print("Enter your choice : ");
            cho = sc.nextInt();

            switch (cho) {
                case 1:
                    System.out.print("\nEnter the amount you want to deposit : ");
                    deposit = sc.nextInt();
                    if (deposit < 100) 
                    {
                        System.out.println("\nDeposit Amount should be greater than Rs 100!!!! \nEnter your choice Again!!!!");
                    } 
                    else if(deposit % 100 != 0)
                    {
                        System.out.println("\nATM can't deposit Rs "+deposit% 100+"\nPlease enter Amount multiple of 100!!!!");
                    }
                    else
                    {
                        pre_bal[index] = balance;
                        balance = balance + deposit;
                        System.out.println("Amount Rs " + deposit + " Deposited in your account!!!");
                        cur_bal[index] = balance;
                        index++;
                    }
                    break;

                case 2:
                    System.out.print("\nEnter the amount you want to withdraw : ");
                    withdraw = sc.nextInt();
                    if(withdraw < 100)
                    {
                        System.out.println("\nWithdraw Amount should be greater than 100!!!!");
                    }
                    else if(withdraw > 10000)
                    {
                        System.out.println("\nYou can't withdraw more than Rs 10000 in one time!!!");
                    }
                    else if((withdraw + withdraw_bal) > 20000)
                    {
                        System.out.println("\nNot Allowed!!! \nToday you can only withdraw : Rs "+(20000 - withdraw_bal)+" of your daily limit!!");
                    }
                    else if(withdraw % 100 != 0)
                    {
                        System.out.println("\nATM can't dispense Rs "+withdraw % 100+"\nPlease enter Amount multiple of 100!!!!");
                    }
                    else if (((balance - withdraw) >= 0) && (withdraw <= 10000) && (withdraw_bal <=20000))  
                    {
                        pre_bal[index] = balance;
                        balance = balance - withdraw;
                        System.out.println("Amount Rs " + withdraw + " withdraw from your account!!!");
                        cur_bal[index] = balance;
                        index++;

                        withdraw_bal += withdraw;
                    } 
                    else
                        System.out.println("\nRequested Amount is not available in your account!!!!");
                    break;

                case 3:
                    if (index == 0) {
                        System.out.println("\nNo Operation performed to display Statement!!!");
                    } 
                    else 
                    {
                        for (int i = 0; i < index; i++) 
                        {
                            if((cur_bal[i]- pre_bal[i]) >= 0)
                            {
                                System.out.print("\nCredited : Rs "+(cur_bal[i]- pre_bal[i]));
                            }
                            else
                                System.out.print("\nWithdrawn : Rs "+(pre_bal[i] - cur_bal[i]));
                        }
                        System.out.println("\nAvailable Amount in your account : "+balance);
                    }
                    break;

                case 4:
                    System.out.println("Available Balance : Rs " + balance);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("\nInvalid Input!!! ");

            }
        }

    }
}