import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Saving account2 = new Saving();
        Checking account1 = new Checking();



        int choice;
        int choice2;

        do{

            System.out.println(
                    "1. Withdraw from Checking\n" +
                            "2. Withdraw from Savings\n" +
                            "3. Deposit to Checking\n" +
                            "4. Deposit to Savings\n" +
                            "5. Balance of Checking\n" +
                            "6. Balance of Savings\n" +
                            "7. Award Interest to Savings now\n" +
                            "8. Quit");

            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();


            if (choice == 1){
                System.out.println("How much would you like to withdraw from your checking: ");
                choice2 = x.nextInt();
                x.nextLine();
                account1.withdraw(choice2);

            }


            else if (choice == 2){
                System.out.println("How much would you like to withdraw from your savings: ");
                choice2 = x.nextInt();
                x.nextLine();
                account2.withdraw(choice2);

            }


            else if (choice == 3){
                System.out.println("How much would you like to deposit into your checking: ");
                choice2 = x.nextInt();
                x.nextLine();
                account1.deposit(choice2);


            }


            else if (choice == 4){
                System.out.println("How much would you like to deposit into your savings: ");
                choice2 = x.nextInt();
                x.nextLine();
                account2.deposit(choice2);


            }

            else if (choice == 5){
                System.out.println("Your balance for checking " + account1.getAccountNumber() + " is " + account1.getAccountBalance());


            }

            else if (choice == 6){
                System.out.println("Your balance for savings " + account2.getAccountNumber() + " is " + account2.getAccountBalance());


            }

            else if (choice == 7){
                account2.interest();


            }



        }while (choice != 8);


    }
}