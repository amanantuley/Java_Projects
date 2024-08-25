// Atm Interface..

import java.util.Scanner;

public class Atm_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        int deposit;
        int withdraw;

        while(true)
        {
            System.out.println("\t\tMenu");
            System.out.println("\t1. Deposit");
            System.out.println("\t2. Withdraw");
            System.out.println("\t3. Check Balance");
            System.out.println("\t4. Exit");
            System.out.print("\tEnter your choice :: ");

            int choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                System.out.println("Enter the Amount to Deposit ::");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Updated Balance is :" + balance);
                System.out.println();
                break;

                case 2:
                System.out.println("Enter the Amount to Withdraw ::");
                withdraw = sc.nextInt();
                if(withdraw > balance){
                System.out.println("Insufficient Balance");
                }
                else
                {
                    balance = balance - withdraw;
                    System.out.println("Withdrawl Has been Done ! , Your Balance ::" +balance);
                    System.out.println();
                }
                break;

                case 3:
                System.out.println("Your Balance is :" + balance);
                System.out.println();
                break;

                case 4:
                System.exit(choice);
            }
        }

        // Aman Antuley



    }
}
