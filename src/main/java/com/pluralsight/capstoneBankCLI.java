package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Task: Create a new Java project and a class for managing transactions.
//Hint: Create a class named TransactionApp with a main method.
//Consider: Think about what kind of data you'll be storing for each transaction (e.g., date, amount, vendor).

//Step 3: Display the Home Screen Menu
//Task: Write a method to display a menu with options like "Add Deposit," "Make Payment," "View Ledger," etc.
//Hint: Use System.out.println for each option and Scanner to read user input.
//Question: How can you keep showing the menu until the user decides to exit?

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Define the format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

            // Format the current date and time
            String formattedDateTime = currentDateTime.format(formatter);

            while (option != 4)
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║* Welcome to Capstone Bank! *║");
            System.out.println("╚═════════════════════════════╝");
            System.out.println("*Today's Date and Time: " + formattedDateTime + "*");
            System.out.println("═══════════════════════════════");

            System.out.println("Please type in the letter that matches the option needed: ");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment");
            System.out.println("L) View Past Ledger Information");
            System.out.println("X) Exit the Application");
            System.out.println("Please enter the required letter here: "); //Get the user's input here

            String choice = "";
            while (!choice.equalsIgnoreCase("") {

                switch (option);
                    case 1:
                    System.out.println("Please enter in the amount of the deposit you'd like to make: ");
                    int number1 = scanner.nextInt();
                    break;

                    case 2:
                    System.out.println("Please enter in the amount of the payment you made: ");
                    int number2 = scanner.nextInt();
                    break;

                    case 3:
                    System.out.println("What information from the ledger would you like to view? ");
                    String string1 = scanner.next();
                    break;

                    case 4:
                    System.out.println("Thank you for banking with Capstone Bank, we greatly value your service!");
                    break;

                    default;
                    System.out.println("Invalid input, please try again.");
                    //Is this where the error goes? Labeling it as default feels weird. Maybe an error handler class is needed?

                    choice = scanner.nextLine().trim();
                    scanner.close();
        }
    }

//Step 4: Implement Input Loop
//Task: Set up a loop that keeps displaying the menu until the user selects "Exit."
//Hint: Use a while loop to keep the program running.
//Question: How will you handle different user choices, like adding a deposit or viewing the ledger?

// TODO: Add logic for each menu option.

//Step 5: Add Functionality for Deposits
//Task: Write a method to add a new deposit.
//Hint: Prompt the user for information such as description, vendor, and amount.
//Consider: What happens if the user enters a negative amount? How will you handle that?
//Example Guidance: Think about how you would store this data in a format that can be easily saved to a file.

public static void addDeposit () {

// Prompt for description.

System.out.print("Enter description: ");

// Prompt for vendor.
// Prompt for amount.
// Create a transaction object.

// TODO: Save the transaction to the list or file.

//Step 6: Add Functionality for Payments
//Task: Write a method to add a new payment.
//Hint: This method will be similar to the deposit method but will record the amount as a negative value.
//Consider: How will you ensure that payments are correctly saved as negative values?

public static void writeToCsv (String record){

// Open the file in append mode.
// Write the record and a newline.

// TODO: Handle exceptions for file operations.

//Step 7: Write a Method to Save to CSV
//Task: Create a method that saves transaction details to a CSV file.
//Hint: Think about which classes and methods in Java can help write data to files.
//Consider: How can you ensure that each transaction is saved on a new line in the file?

public static void writeToCsv (String record){

// Open the file in append mode.
// Write the record and a newline.

// TODO: Handle exceptions for file operations.

//Step 8: Write a Method to Read from CSV
//Task: Write a method that reads transaction data from the CSV file into a list.
//Hint: Use Java's file reading methods to get all lines from the CSV file.
//Consider: How will you handle situations where the file does not exist yet?

public static List<String> readFromCsv ()

{ // Read lines from the CSV.

// TODO: Parse each line into a transaction object.

// Return the list of transaction objects. }

//Step 9: Display the Ledger
//Task: Create a method to display all transactions in a readable format.
//Hint: Loop through each transaction and print its details.
//Question: How can you format the output to make it easy to read?

public static void showLedger (List < FinancialTransactionsCLI > transactions)

// Loop through the list.

// TODO: Format each transaction nicely for display.

//Step 10: Sort Transactions by Date
//Task: Write a method to sort transactions by date.
//Hint: Use Java's List.sort() method with a custom comparator.
//Consider: Should the transactions be sorted from oldest to newest or the other way around?
//Example Guidance: Think about how you can use Java's compareTo() method for comparing dates.

public static void sortTransactionsByDate (List < FinancialTransactionsCLI > transactions) {
transactions.sort((line1, line2) -> line2.getDate().compareTo(line1.getDate()));

//Step 11: Implement Reports
//Task: Create a method to generate different types of reports (e.g., Month to Date, Year to Date).
//Hint: Use Java's LocalDate and ChronoUnit classes for date calculations.
//Consider: How will you filter transactions to include only those within a certain date range?
// Example Guidance: Think about how to create a method that accepts a date range and returns only transactions within that range.

public static void generateReport (/* parameters */) {

// Filter transactions based on the selected report type.

// TODO: Display only the relevant transactions.

//Step 12: Search by Vendor
//Task: Write a method that allows users to search for transactions by vendor.
//Hint: Use a loop to find transactions that match the user's input for the vendor name.
//Consider: How can you make the search case-insensitive?
//Example Guidance: Think about using String methods that can help match user input to vendor names.

public static void searchByVendor (String vendor){

// Loop through transactions.
// Check if the vendor matches the input.

// TODO: Display matching transactions.

//Step 13: Validate User Input
//Task: Ensure that user input is validated throughout the application.
//Hint: Check for valid amounts, dates, and other data.
//Consider: How will you handle input errors gracefully without crashing the program?
//Question: What kind of error messages would be helpful to users?

public static double promptForAmount () {

// Prompt the user.
// Parse the input.

// TODO: Validate that the amount is a positive number.

//Step 14: Final Testing and Debugging
//Task: Test the entire application, focusing on edge cases like an empty CSV file or invalid user input.
//Hint: Add print statements to trace where things might be going wrong during testing.
// Consider: How will you ensure the application handles unexpected scenarios?