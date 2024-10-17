package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mainCLI {

    public void main(String[] args) {

        class displayBanner {
            final displayBanner displayBanner = new displayBanner();

            public displayBanner() {
                String fileName = "C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/CapstoneBankBanner.txt";

                //IO for the banner
                try (BufferedReader reader = new BufferedReader(new FileReader("CapstoneBankBanner.txt"))) {
                    String line = "";
                    while (line.equals(reader.readLine())) System.out.println(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                //Date and time config
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

                //Menu starts here!
                Scanner scanner = new Scanner(System.in);
                char option;

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
                    option = scanner.nextLine().toUpperCase().charAt(0);

                    boolean homeScreen;
                    boolean newDeposit;
                    boolean newPayment;
                    boolean ledgerScreen;
                    boolean reportsScreen;
                    boolean endingScreen;

                    //Initializing menu loop...

                    switch (option) {
                        case 'D': {

                            homeScreen = false;
                            newPayment = false;
                            ledgerScreen = false;
                            endingScreen = false;
                            reportsScreen = false;
                            newDeposit = true;

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

                            homeScreen = false;
                            ledgerScreen = false;
                            endingScreen = false;
                            reportsScreen = false;
                            newDeposit = false;
                            newPayment = true;

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

                            homeScreen = false;
                            endingScreen = false;
                            reportsScreen = false;
                            newDeposit = false;
                            newPayment = false;
                            ledgerScreen = true;

                            System.out.println("Would you like to view ledgers sorted by:");
                            System.out.println("A) All - Displays all ledgers currently available to access.");
                            System.out.println("D) Only the currently available deposits.");
                            System.out.println("P) Only the currently available payments.");
                            System.out.println("Please enter the letter of your desired search:");
                            break;
                        }

                        case 'R': {

                            homeScreen = false;
                            endingScreen = false;
                            newDeposit = false;
                            newPayment = false;
                            ledgerScreen = false;
                            reportsScreen = true;

                            System.out.println("Would you like to view reports sorted by:");
                            System.out.println("Transactions Listed by Month to Date");
                            System.out.println("Transactions From Previous Month");
                            System.out.println("Transactions From Previous Year to Date");
                            System.out.println("Transactions From Previous Year");
                            System.out.println("Transactions From A Specific Vendor");
                            System.out.println("0) Go to Previous Page");
                            System.out.println("0) Go to Home Page");
                            break;
                        }

                        //Ending Screen
                        case 'X': {

                            homeScreen = false;
                            newDeposit = false;
                            newPayment = false;
                            ledgerScreen = false;
                            reportsScreen = true;
                            endingScreen = true;

                            System.out.println("Thank you for your patronage, have a wonderful day!");
                            System.out.println("Golden Phoenix Financial Corporation: Blaze a path to better finances.");
                            break;

                        }
                    }
                } while (option != 'X');
                scanner.close();
            }
        }
    }
}

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