import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bank b = new Bank(1, "Gowtham");
        Scanner sc = new Scanner(System.in);


        while(true)
        {
            System.out.println("This is the Banking Application");
            System.out.println("1 -> Get Details");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Amount Deposit");
            System.out.println("4 -> Check Balance");
            System.out.println("5 -> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice == 1)
            {
                b.getDetails();
            }
            else if(choice == 2)
            {
                System.out.print("Enter the amount: ");
                int amount = sc.nextInt();
                b.withdraw(amount);
            }
            else if(choice == 3)
            {
                System.out.print("Enter the amount: ");
                int amount = sc.nextInt();
                b.deposit(amount);
            }
            else if(choice == 4)
            {
                b.getBalance();
            }
            else if (choice == 5)
            {
                System.out.println("The application closed successfully");
                break;
            }
            else
            {
                System.out.println("Invalid option");
            }


        }
    }
}