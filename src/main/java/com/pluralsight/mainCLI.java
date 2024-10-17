package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mainCLI {

    public void main(String[] args) {

        class displayBanner(String[] args) {
            final displayBanner displayBanner = new displayBanner();

        public displayBanner() {
            String fileName = "C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/CapstoneBankBanner.txt";

            //IO for the banner
            try (BufferedReader reader = new BufferedReader(new FileReader("CapstoneBankBanner.txt"))) {
                String line = "";
            while (line.equals(reader.readLine())) System.out.println(line);
            } catch (IOException e) {
                throw new RuntimeException(e); }

            //Date and time config
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

                //Menu starts here!
                Scanner scanner = new Scanner(System.in);
                System.out.println("Today's Date and Time: " + formattedDateTime);

                System.out.println("══════════════════════════════════════════════════════════════");
                System.out.println("Please type in the letter that matches the option needed: ");
                System.out.println("D) Add Deposit");
                System.out.println("P) Make Payment");
                System.out.println("L) View Past Ledger Information");
                System.out.println("X) Exit the Application");
                System.out.println("Please enter the required letter here: ");
                System.out.println("══════════════════════════════════════════════════════════════");

                //Initializing menu loop...

                class depositpaylogistics {

                    Scanner scanner = new Scanner(System.in);

                    while(nextScreen) {
                    char option = scanner.nextLine().toUpperCase().charAt(0);
                    switch (option)

                            case "D": {
                            //Make the variables to ask for here:
                            String date = ""; //Current date
                            String time = ""; //Current time
                            String description = ""; //Description of item, like 'vacuum cleaner'
                            String vendor = ""; //Who paid you/who did you pay?
                            String type = ""; //Are you getting paid or paying someone else?
                            double amount = 0; //Amount that you're receiving or paying }

                            System.out.println("Please enter in the description of your transaction: ");
                            description = scanner.nextLine();

                            System.out.println("Please enter in the name or business that you received the deposit from: ");
                            vendor = scanner.nextLine();

                            System.out.println("Please enter the amount of the deposit you would like to make: ");
                            amount = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.println("Last Transaction Input Recorded: " + description + date + time + vendor + amount);
                            break; }

                            //Payment Info
                            case 'P': {
                            String date;
                            String time;//Put that formula in here
                            String description; //Something like 'vacuum cleaner'
                            String vendor; //like Target
                            String type; //Are you getting paid or paying someone else?
                            double amount; //Amount that you're receiving or paying

                            System.out.println("Please enter in the description of your transaction: ");
                            description = scanner.nextLine();

                            System.out.println("Please enter in the name or business that you received the deposit from: ");
                            vendor = scanner.nextLine();

                            System.out.println("Please enter the amount of the deposit you would like to make: ");
                            amount = scanner.nextDouble();
                            scanner.nextLine(); //line break

                            System.out.println("Last Transaction Input Recorded: " + description + date + time + vendor + amount);
                            break; }

                            //Ledger Screen
                            case 'L': {
                            break; }

                            //Ending Screen
                            case 'X': {
                            System.out.println("Thank you, and have a wonderful day!");
                            System.out.println("Golden Phoenix Financial Corporation: Blaze a path to better finances.");
                            break; }
                    }
                }
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