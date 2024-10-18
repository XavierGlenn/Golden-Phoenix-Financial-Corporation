package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mainCLI {

    public void main(String[] args) {

        menuLoop(); } //Menu? I think it goes here?

        public static void menuLoop() {
        Scanner scanner = new Scanner(System.in);
            final char[] option = new char[1];

        class displayBanner {
            final displayBanner displayBanner = new displayBanner();

            public void displayBanner() {
                String fileName = "C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/CapstoneBankBanner.txt";

                displayBanner();

                //IO for the banner
                try (BufferedReader reader = new BufferedReader(new FileReader("CapstoneBankBanner.txt"))) {
                    String line = "";
                    while (line.equals(reader.readLine())) System.out.println(line);
                } catch (IOException e) {
                    System.out.println("Error reading the GPFC banner file.");
                    e.printStackTrace();
                }
            }
        }

                //Date and time config
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

                //Menu starts here!

                do {
                    System.out.println("Today's Date and Time: " + formattedDateTime);
                    System.out.println("══════════════════════════════════════════════════════════════");
                    System.out.println("Please type in the letter that matches the option needed: ");
                    System.out.println("D) Add Deposit");
                    System.out.println("P) Make Payment");
                    System.out.println("L) View Past Ledger Information");
                    System.out.println("R) View Past Report Information");
                    System.out.println("X) Exit the Application");
                    System.out.println("Please enter the required letter here: ");
                    System.out.println("══════════════════════════════════════════════════════════════");
                    option[0] = scanner.nextLine().toUpperCase().charAt(0);

                    //Initializing menu loop...

                    switch (option[0]) {
                        case 'D': {

                            //Make the variables to ask for here:
                            String date1 = ""; //Current date
                            String time1 = ""; //Current time
                            String description1 = ""; //Description of item, like 'vacuum cleaner'
                            String vendor1 = ""; //Who paid you/who did you pay?
                            String type1 = ""; //Are you getting paid or paying someone else?
                            double amount1 = 0; //Amount that you're receiving or paying

                            System.out.println("Please enter in the description of your transaction: ");
                            description1 = scanner.nextLine();

                            System.out.println("Please enter in the name or business that you received the deposit from: ");
                            vendor1 = scanner.nextLine();

                            System.out.println("Please enter the amount of the deposit you would like to make: ");
                            amount1 = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Last Transaction Input Recorded: " + description1 + date1 + time1 + vendor1 + amount1);
                            break;
                        }

                        //Payment Info
                        case 'P': {

                            //Make the variables to ask for here:
                            String date2 = ""; //Current date
                            String time2 = ""; //Current time
                            String description2 = ""; //Description of item, like 'vacuum cleaner'
                            String vendor2 = ""; //Who paid you/who did you pay?
                            String type2 = ""; //Are you getting paid or paying someone else?
                            double amount2 = 0; //Amount that you're receiving or paying

                            System.out.println("Please enter in the description of the payment: ");
                            description2 = scanner.nextLine();

                            System.out.println("Please enter in the name or business the payment was sent to: ");
                            vendor2 = scanner.nextLine();

                            System.out.println("Please enter the amount of the payment: ");
                            amount2 = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Last Transaction Input Recorded: " + description2 + date2 + time2 + vendor2 + amount2);
                            break;
                        }

                        //Ledger Screen
                        case 'L': {

                            System.out.println("Would you like to view ledgers sorted by:");
                            System.out.println("A) All - Displays all ledgers currently available to access.");
                            System.out.println("D) Only the currently available deposits.");
                            System.out.println("P) Only the currently available payments.");
                            System.out.println("Please enter the letter of your desired search:");
                            break; }

                        case 'R': {

                            System.out.println("Would you like to view reports sorted by:");
                            System.out.println("Transactions Listed by Month to Date");
                            System.out.println("Transactions From Previous Month");
                            System.out.println("Transactions From Previous Year to Date");
                            System.out.println("Transactions From Previous Year");
                            System.out.println("Transactions From A Specific Vendor");
                            System.out.println("0) Go to Previous Page");
                            System.out.println("0) Go to Home Page");
                            break; }

                        //Ending Screen
                        case 'X': {

                            System.out.println("Thank you for your patronage, have a wonderful day!");
                            System.out.println("Golden Phoenix Financial Corporation: Blaze a path to better finances.");
                            break; }
                    }
                } while (option[0] != 'X');
                scanner.close();
            }
        }

public class transactionHandler {

    //Let's start with the deposit stuff.
    public static transactionLogicAndIO addDeposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the description of the transaction: ");
        String description = scanner.nextLine();

        System.out.println("Enter the vendor's business name: ");
        String vendor = scanner.nextLine();

        Object amount = getValidAmount(scanner, "Enter the deposit amount:");

        transactionLogicAndIO deposit = new transactionLogicAndIO(LocalDate.now(), LocalTime.now(), (Double) amount);
        return deposit; }

    //Now for the validation.

    private static Object getValidAmount(Scanner scanner, String s) {
        Object amount = -1;
        while (true) {
                if (scanner.hasNextDouble()) {
                    amount = (int) scanner.nextDouble();
                    System.out.println("Amount must be negative.");
                } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); }
                } return amount;

    //Now for deposit logic:
    Transaction addDeposit; {
                    scanner = new Scanner(System.in);

        System.out.println("Enter description: ");
        String description = scanner.nextLine();

        System.out.println("Enter vendor's name: ");
        String vendor = scanner.nextLine();

        amount = getValidAmount(scanner, "Enter payment amount (positive value): ");

        //Total
        Transaction payment = new Transaction();
        System.out.println("Payment added successfully!");

        return payment;

        //Payment logic
        public static Transaction addPayment(); {
                        scanner = new Scanner(System.in);

            System.out.println("Enter description: ");
                        description = scanner.nextLine();

            System.out.println("Enter vendor's name: ");
                        vendor = scanner.nextLine();

                        amount = getValidAmount(scanner, "Enter payment amount (negative value): ");

            //Total again
                        payment = new Transaction);
                        System.out.println("Payment added successfully!");

                        Transaction payment1 = payment;
                        Transaction payment2 = payment1;
                        Transaction payment3 = payment2;
                        Transaction payment4 = payment3;
                        return payment4;

                class depositpaylogistics(String date, String time, String description, String vendor, String type, double amount) {
                    public void main() {

                        //Ready... Getters, Setters, Go!
                        //Date Get-Set
                        public String getDate () {
                            return date;
                        }
                        public void setDate (String date){
                            this.date = date;
                        }

                        //Time Get-Set
                        public String getTime () {
                            return time;
                        }
                        public void setTime (String time){
                            this.time = time;
                        }

                        //Description Get-Set
                        public String getDescription () {
                            return description;
                        }
                        public void setDescription (String description){
                            this.description = description;
                        }

                        //Vendor Get-Set
                        public String getVendor () {
                            return vendor;
                        }
                        public void setVendor (String vendor){
                            this.vendor = vendor;
                        }

                        //Type Get-Set
                        public String getType () {
                            return type;
                        }

                        public void setType () {
                            this.type = type;
                        }

                        //Amount Get-Set
                        public double getAmount () {
                            return amount;
                        }

                        public void setAmount ( double amount){
                            this.amount = amount;
                        }

                        while () {
                            private double balance;
                        }

                        class csvReading {
                            public static void list(transactionLogicAndIO) readTransactionsInCSV(
                            String filename)

                            {
                                list(transactionLogicAndIO) ArrayList<Object> transactions = new ArrayList<>();

                                //try-catch with buffer reader again:
                                try BufferedReader reader = new BufferedReader(new FileReader(filename)) {
                                String line;
                    while((line =reader.readLine())!=null)

                                {
                                    String[] fields = line.split(",");
                                    LocalDate date = LocalDate.parse(fields[0]);
                                    LocalTime time = LocalTime.parse(fields[1]);
                                    double amount = Double.parseDouble(fields[2]);
                                    transactionLogicAndIO.add(new transactionLogicAndIO(date, time, amount));
                                }
                            } catch(IOException e){
                                System.out.println("An error occurred while trying to access and read this file. Please try again.");
                                e.printStackTrace();
                                return transactions;
                            }


                                class csvWriting {

                                    public static void writetTransactionsInCSV(List<transactionLogicAndIO> transactions, String filename) {
                                        try (FileWriter writer = new FileWriter(filename, true)) { //Do the appends
                                            for (transactionLogicAndIO transaction = new transactionLogicAndIO) {
                                                writer.write(transaction.toString() + "\n");
                                            }
                                        } catch (IOException e) {
                                            System.out.println("An error occurred. Please try again.");
                                            e.printStackTrace();
                                        }

                                        Transaction deposit = transactionHandler.addDeposit();
                                        transactionLogicAndIO.add(deposit);

                                        Transaction payment = transactionHandler.addPayment();
                                        transactionLogicAndIO.add(payment);

                                        csvWriting.writetTransactionsInCSV(transactions, "transactions.csv");

                                        //have to make sure we can actually see the thing now.
                                        public class displayingLedger {
                                            public static void displayTransactions(List<Transaction> transactions) {
                                                for (Transaction transaction = transactions) {
                                                    System.out.println("Date: " + transactions.getDate() + ", Time: " + transactions.getTime() + ", in the amount of: " + transaction.getAmount());
                                                }

                                                public class sortingTransactions {
                                                    //I don't like this code. I get it, I get why it works, but I don't like it. It unsettles me. It's intimidating.
                                                    public static void sortingTransactionsByDate(List(transactionLogicAndIO) transactions)

                                                    {
                                                        Collections.sort(transactions, Comparator.comparing(transactionLogicAndIO:
                                                        getDate));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
            //if I have time:
            // Open the file in append mode.
            // Write the record and a newline.
            //Handle exceptions for file operations.
            // Save the transaction to the list or file.
            // Add logic for each menu option.

            //Step 5: Add Functionality for Deposits
            //Task: Write a method to add a new deposit.
            //Hint: Prompt the user for information such as description, vendor, and amount.
            //Consider: What happens if the user enters a negative amount? How will you handle that?
            //Example Guidance: Think about how you would store this data in a format that can be easily saved to a file.
            /* parameters */
            //Step 6: Add Functionality for Payments
            //Task: Write a method to add a new payment.
            //Hint: This method will be similar to the deposit method but will record the amount as a negative value.
            //Consider: How will you ensure that payments are correctly saved as negative values?

            /* Prompt the user.
            Parse the input.
            Validate that the amount is a positive number.*/

            //https://skills4ittraining.sharepoint.com/:o:/r/sites/Opdrachtgevers/_layouts/15/Doc.aspx?sourcedoc=%7B901a5ac1-3af7-4752-9d89-980ae31fd3d1%7D&action=default&CID=0afe8e77-bd91-4fe2-ad21-b91d27efc074&_SRM=0%3AG%3A298
            //Collections.sort(transactions, Comparator.comparing(Transaction::getDate));

            //Step 13: Validate User Input
            //Task: Ensure that user input is validated throughout the application. Check for valid amounts, dates, and other data.
            //Consider: How will you handle input errors gracefully without crashing the program? What kind of error messages would be helpful to users?

            //Step 14: Final Testing and Debugging
            //Task: Test the entire application, focusing on edge cases like an empty CSV file or invalid user input. Add print statements to trace where things might be going wrong during testing. How will you ensure the application handles unexpected scenarios?

            //Other Requirements
            //Your project must also meet the following requirements:
            //It must contain an informative README file that:
            //Describes your project
            //Includes images of your application screens AND PUT IT IN THE README TOO
            //Describes/shows one interesting piece of code from your project
            //Commit and push one last time