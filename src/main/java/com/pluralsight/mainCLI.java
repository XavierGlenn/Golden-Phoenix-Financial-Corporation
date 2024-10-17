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
                    System.out.println("X) Exit the Application");
                    System.out.println("Please enter the required letter here: ");
                    System.out.println("══════════════════════════════════════════════════════════════");
                    option = scanner.nextLine().toUpperCase().charAt(0);

                    boolean homeScreen;
                    boolean newDeposit;
                    boolean newPayment;
                    boolean ledgerScreen;
                    boolean endingScreen;

                    //Initializing menu loop...

                    switch (option) {
                        case 'D': {

                            homeScreen = false;
                            newPayment = false;
                            ledgerScreen = false;
                            endingScreen = false;
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
                            newDeposit = false;
                            newPayment = true;

                            //Make the variables to ask for here:
                            String date2 = ""; //Current date
                            String time2 = ""; //Current time
                            String description2 = ""; //Description of item, like 'vacuum cleaner'
                            String vendor2 = ""; //Who paid you/who did you pay?
                            String type2 = ""; //Are you getting paid or paying someone else?
                            double amount2 = 0; //Amount that you're receiving or paying

                            System.out.println("Please enter in the description of your transaction: ");
                            description2 = scanner.nextLine();

                            System.out.println("Please enter in the name or business that you received the deposit from: ");
                            vendor2 = scanner.nextLine();

                            System.out.println("Please enter the amount of the deposit you would like to make: ");
                            amount2 = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Last Transaction Input Recorded: " + description2 + date2 + time2 + vendor2 + amount2);
                            break;
                        }

                        //Ledger Screen
                        case 'L': {

                            homeScreen = false;
                            endingScreen = false;
                            newDeposit = false;
                            newPayment = false;
                            ledgerScreen = true;

                            //Make the variables to ask for here:
                            String date = ""; //Current date
                            String time = ""; //Current time
                            String description = ""; //Description of item, like 'vacuum cleaner'
                            String vendor = ""; //Who paid you/who did you pay?
                            String type = ""; //Are you getting paid or paying someone else?
                            double amount = 0; //Amount that you're receiving or paying

                            System.out.println("Please enter in the description of your transaction: ");
                            description = scanner.nextLine();

                            System.out.println("Please enter in the name or business that you received the deposit from: ");
                            vendor = scanner.nextLine();

                            System.out.println("Please enter the amount of the deposit you would like to make: ");
                            amount = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Last Transaction Input Recorded: " + description + date + time + vendor + amount);
                            break;
                        }

                        //Ending Screen
                        case 'X': {

                            homeScreen = false;
                            newDeposit = false;
                            newPayment = false;
                            ledgerScreen = false;
                            endingScreen = true;

                            System.out.println("Thank you, and have a wonderful day!");
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
//Includes images of your application screens
//Describes/shows one interesting piece of code from your project
//Commit and push one last time