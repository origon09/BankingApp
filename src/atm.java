
import java.util.InputMismatchException;
import java.util.Scanner;

public class atm {



    public static void main(String[] args) throws InterruptedException {

        //variables that will keep the loop running and also keep track of users info
         boolean isRunning = true;
         double balance = 0;
         double withdrawal = 0;
         double deposit = 0;

         while (isRunning) {
             try {
                 //creating scanners for user input
                 Scanner sc = new Scanner(System.in);
                 Scanner in = new Scanner(System.in);
                 Thread.sleep(600);


                 //Banking application starting
                 System.out.println("\nWelcome to the Banking App");
                 System.out.println("1. Deposit");
                 System.out.println("2. Withdraw");
                 System.out.println("3. Balance");
                 System.out.println("4. Exit");
                 System.out.println("Pick an option: ");

                 int input = 0;

                 //holds user decision
                 input = sc.nextInt();

                 //lets user deposit
                 if (input == 1) {
                     System.out.println("Enter the amount to deposit: $");
                     deposit = in.nextDouble();
                     balance += deposit;
                     System.out.println("You deposited $" + deposit);
                     Thread.sleep(300);
                 }
                 //lets user withdraw
                 if (input == 2) {
                     System.out.println("Enter the amount to withdraw: ");
                     withdrawal = in.nextDouble();
                     balance -= withdrawal;
                     System.out.println("You withdrew $" + withdrawal);
                 }
                 //lets user check balance
                 if (input == 3) {
                     System.out.println("Your balance is: $" + balance);
                 }
                 //lets user exit
                 if (input == 4) {
                     System.out.println("Thanks for using the Banking App");
                     Thread.sleep(300);
                     System.exit(0);
                 }

             } catch (InputMismatchException e) {
                 System.out.println("Please enter a number");

             }
         }
    }
}
