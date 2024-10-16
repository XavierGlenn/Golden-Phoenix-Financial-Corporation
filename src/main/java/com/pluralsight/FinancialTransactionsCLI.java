package com.pluralsight;

//Step 2: Design a Class to Represent a Transaction
//Task: Create a class that will store details for each transaction.
//Hint: Define fields for date, time, description, vendor, type (e.g., Deposit or Payment), and amount.
//Tip: Consider using Java's LocalDate and LocalTime classes for handling date and time.

public class FinancialTransactionsCLI {

String = "";
int input = 0;

while (newDeposit) {
System.out.println("This is the deposit window, to go back, press X.");
System.out.println("Please enter the amount of the deposit you would like to make: ");
int deposit = scanner.nextInt();
System.out.println("Please confirm the payment amount is correct: ");
String input = scanner.nextLine().toLowerCase();

else {
boolean validOption;
validOption =false;
System.out.println("Error: Incorrect input. Please try again.");
break;

while(true) {
    if (input.equalsIgnoreCase("Y")) {
        scanner.nextLine();
        System.out.println("Thank you, your deposit has been confirmed. You will now see this reflected in your ledger.");
    }
    validOption = true;
    nextScreen = false;
//breaks loop here

else if (input.equalsIgnoreCase("N")) {
        System.out.println("Would you like to retry?");
        scanner.nextLine();
        validOption = true;
        newDeposit = true;
        nextScreen = false;
    }
//breaks loop again

    else {
        validOption = false;
        System.out.println("Error: Incorrect input. Please try again.");
        break;
    }

    public static void addDeposit {
        private double balance;

        public static double promptForAmount () {

            // Make your constructor
            // Prompt for description.
            // Prompt for vendor.
            // Prompt for amount.
            // Create a transaction object.
            // Parse the input.
            // TODO: Save the transaction to the list or file.
            // TODO: Add logic for each menu option.
        }

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
            nextScreen = false;
        }
            //breaks loop here

        else if (input.equalsIgnoreCase("N")) {
            System.out.println("Would you like to retry?");
            scanner.nextLine();
            validOption = true;
            newPayment = true;
            nextScreen = false;
        }
            //breaks loop again

        else {
            validOption = false;
            System.out.println("Error: Incorrect input. Please try again.");
            break;

// Fields for type, date, time, description, vendor, and amount.

// Constructor here.

public FinancialTransactionsCLI(/* parameters */) {

// Initialize fields.

// Getters and setters here.

//Step 6: Add Functionality for Payments
//Task: Write a method to add a new payment.
//Hint: This method will be similar to the deposit method but will record the amount as a negative value.
//Consider: How will you ensure that payments are correctly saved as negative values?

                public static double promptForAmount () {

// Prompt the user.
// Parse the input.
// TODO: Validate that the amount is a positive number.
                }
            }
        }
    }
}