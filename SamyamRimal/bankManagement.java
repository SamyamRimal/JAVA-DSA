import java.util.HashMap;
import java.util.Scanner;

public class bankManagement {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<Integer, Double> accounts = new HashMap<>();
    public static void main(String[] args) {
       
       
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("13. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
        

        switch (choice) {
            case 1: createAccount(); break;
            case 2: deposit(); break;
            case 3: withdraw(); break;
            case 4: checkBalance(); break;
            case 5: transfer(); break;
            case 6: {
                System.out.println("Thank you for visiting SR Bank."); 
                System.exit(0);
                break;
            }
            default: System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
        
        }

        private static void createAccount() {
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your account number:");
            int accountNumber = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            System.out.println("Enter Initial deposite:");
            double initialDeposit = sc.nextDouble();

            if(accounts.containsKey(accountNumber)){
                System.out.println("Account already exists");
            }
            else{
                accounts.put(accountNumber, initialDeposit); // This statment sends data to accounts (.puts)
                System.out.print("Your account has been created successfully with name : " + name + " and account number: " + accountNumber);
            }
        }

        private static void deposit(){
            System.out.print("Enter your account number: ");
            int accountNumber = sc.nextInt();
            if(accounts.containsKey(accountNumber)){
                System.out.println("Enter the amount you want to Deposite: ");  
                double deposite = sc.nextDouble();    
                if(deposite > 0){
                    accounts.put(accountNumber, accounts.get(accountNumber) + deposite); // This statement updates the data in accounts by adding (+) deposite.
                    System.out.println("Deposited successfully. New balance" +accounts.get(accountNumber));
                }          
                else {
                    System.out.println("Invalid amount");
                }
            }
            else{
                System.out.println("Account does not exist");
            }
        }

        private static void withdraw(){
            System.out.print("Enter your account number: ");
            int accountNumber = sc.nextInt();
            if(accounts.containsKey(accountNumber)){
                System.out.println("Enter the amount you want to withdraw: ");
                double withdraw = sc.nextDouble();
                if(withdraw > 0 && accounts.get(accountNumber) >= withdraw){
                    accounts.put(accountNumber, accounts.get(accountNumber) - withdraw); // This statement updates the data in accounts by subtracting (-) withdraw.
                }
                else{
                    System.out.println("Invalid amount");
                }  
            }
            else{
                System.out.println("Account does not exist");
            }
        }
    
        private static void checkBalance(){
            System.out.print("Enter your account number: ");
            int accountNumber = sc.nextInt();
            if(accounts.containsKey(accountNumber)){
                System.out.println("Your balance is: " + accounts.get(accountNumber));
                }
                else{
                    System.out.println("Account does not exist");
                }
        }

        private static void transfer(){
            System.out.print("Enter your account number: ");
            int senderAccount = sc.nextInt();
            if(senderAccount != 0 && accounts.containsKey(senderAccount)){
                System.out.print("Enter the account number you want to transfer to: ");
                int reciverAccount = sc.nextInt();
                if(accounts.containsKey(senderAccount) && accounts.containsKey(reciverAccount)){
                    System.out.print("Enter the amount you want to transfer: ");
                    double transfer = sc.nextDouble();
                    if(transfer >=senderAccount){
                        accounts.put(senderAccount, accounts.get(senderAccount) - transfer);
                    accounts.put(reciverAccount, accounts.get(reciverAccount) + transfer); 
                    System.out.println("Transfer successfully." );
                }          
                else {
                    System.out.println("Invalid amount");
                }
                }
                else{
                    System.out.println("Account does not exist");
                }
            }
        }
    }


