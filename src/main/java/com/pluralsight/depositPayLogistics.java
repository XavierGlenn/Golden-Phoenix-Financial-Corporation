package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

//file writer, file reader add, split, convert. if split -> make add .object with stored info <- arraylist?, reference another constructor class.

    public static class depositpaylogistics {

        //Make the variables to ask for here:
        String date;
        String time;//Put that formula in here
        String description; //Something like 'vacuum cleaner'
        String vendor; //like Target
        String type; //Are you getting paid or paying someone else?
        double amount; //Amount that you're receiving or paying


        //All the this. goes here:
        public depositpaylogistics(String date, String time, String description, String vendor, String type, double amount) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;
            this.type = type;
            this.amount = amount;
        }


        //Ready... Getters, Setters, Go!

        //Date Get-Set
        public String getDate() { return date; }

        public void setDate(String date) { this.date = date; }


        //Time Get-Set
        public String getTime() { return time; }

        public void setTime(String time) { this.time = time; }


        //Description Get-Set
        public String getDescription() { return description; }

        public void setDescription(String description) {
            this.description = description;
        }


        //Vendor Get-Set
        public String getVendor() { return vendor; }

        public void setVendor(String vendor) { this.vendor = vendor; }


        //Type Get-Set
        public String getType() { return type; }

        public void setType() { this.type = type; }

        //Amount Get-Set
        public double getAmount() { return amount; }

        public void setAmount(double amount) { this.amount = amount; }


    //Date and time config
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

        Scanner scanner = new Scanner(System.in);

        while(mainCLI.newDeposit) {

        System.out.println("This is the deposit window, to go back, press X.");
        System.out.println("Please enter in the description of your transaction: ");
        String description = scanner.nextLine();

        System.out.println("Please enter in the name or business that you received the deposit from: ");
        String vendor = scanner.nextLine();

        System.out.println("Please enter the amount of the deposit you would like to make: ");
        double deposit = scanner.nextDouble();

    //Give the program an example of a constructor and of formatting for what the user sees:
    depositpaylogistics transaction = new depositpaylogistics(); {
    System.out.println("Most Recent Transaction Input Recorded: " + transaction.getDescription() + transaction.getType() + " at " + transaction.getVendor() + "on: " + transaction.getDate() + transaction.getTime() + "for the amount of: $" + transaction.getAmount()); }

    public static void addDeposit {
                private double balance;

                public static double promptForAmount () {

                    // Save the transaction to the list or file.
                    // Add logic for each menu option.

//Step 5: Add Functionality for Deposits
//Task: Write a method to add a new deposit.
//Hint: Prompt the user for information such as description, vendor, and amount.
//Consider: What happens if the user enters a negative amount? How will you handle that?
//Example Guidance: Think about how you would store this data in a format that can be easily saved to a file.

//_______________________________________________________________//

                while (newPayment) {
                    System.out.println("This is the payment window, to go back, press X.");
                    System.out.println("Please enter the amount of the payment you would like to make: ");
                    int payment = scanner.nextInt();
                    System.out.println("Please confirm the payment amount is correct: ");
                    String input = scanner.nextLine().toLowerCase();
                }

                while (confirmation) {
                    if (input.equalsIgnoreCase("Y")) {
                        scanner.nextLine();
                        System.out.println("Thank you, your deposit has been confirmed. You will now see this reflected in your ledger.");
                    }
                    validOption = true;
                    newPayment = true;
                    nextScreen = false; }
                }
                //breaks loop here

        else if (input.equalsIgnoreCase("N")) {
                    System.out.println("Would you like to retry?");
                    scanner.nextLine();
                    validOption = true;
                    newPayment = true;
                    nextScreen = false; }
                }
                //breaks loop again

                else {
                    validOption = false;
                    System.out.println("Error: Incorrect input. Please try again.");
                    break; }


public FinancialTransactionsCLI(/* parameters */

// Initialize fields.

// Getters and setters here.

//Step 6: Add Functionality for Payments
//Task: Write a method to add a new payment.
//Hint: This method will be similar to the deposit method but will record the amount as a negative value.
//Consider: How will you ensure that payments are correctly saved as negative values?

//public static double promptForAmount

/* Prompt the user.
Parse the input.
Validate that the amount is a positive number.*/