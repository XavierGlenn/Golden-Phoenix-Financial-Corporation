package com.pluralsight;

import java.util.List;

public class ledgerInfo {
    public void main() {

        //Ledger - All entries should show the newest entries first:
        //A) All - Display all entries
        //) Deposits - Display only the entries that are deposits into the account
        //P) Payments - Display only the negative entries (or payments)
    }

        System.out.println("What from the ledger would you like to view? ");
        String ledgerInfo = scanner.next();
        nextScreen = false;
        ledgerScreen = true;
        System.out.println("Transactions Recorded: " + ledgerInfo);
        break;

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

public static void showLedger
(List < FinancialTransactionsCLI > transactions)

// Loop through the list.
// TODO: Format each transaction nicely for display.

//Step 10: Sort Transactions by Date
//Task: Write a method to sort transactions by date.
//Hint: Use Java's List.sort() method with a custom comparator.
//Consider: Should the transactions be sorted from oldest to newest or the other way around?
//Example Guidance: Think about how you can use Java's compareTo() method for comparing dates.

public static void sortTransactionsByDate
(List < FinancialTransactionsCLI > transactions) {
transactions.sort((line1, line2) -> line2.getDate().compareTo(line1.getDate()));
        }
    }
}