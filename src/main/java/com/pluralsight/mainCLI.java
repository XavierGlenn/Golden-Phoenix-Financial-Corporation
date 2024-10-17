//*By: Xavier Glenn - Capstone 1*

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public void main(String[] args) {

    class asciidisplay {
        private boolean nextScreen;

        public void displayBanner(String[] args) {

            String filePath = "CapstoneBankBanner.txt";

            //File IO for banner
            try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/CapstoneBankBanner.txt"))) {
                String line; }
            catch (IOException e) {
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

                //booleans here, only because I really like them. Boolean is a cool word.
                boolean newDeposit;
                boolean newPayment;
                boolean ledgerScreen;

                //Scanner input, as I forgot it yesterday.

                //Initializing menu loop...
                while(nextScreen) {
                    char option = scanner.nextLine().toUpperCase().charAt(0);

                    switch (option) {
                        case 'D': //Deposit Info
                            nextScreen = false;
                            newDeposit = true;
                            break;

                        case 'P': //Payment Info
                            nextScreen = false;
                            newPayment = true;
                            break;

                        case 'L': //Ledger Screen
                            nextScreen = false;
                            ledgerScreen = true;
                            break;

                        case 'X': //Ending Screen
                            System.out.println("Thank you, and have a wonderful day!");
                            System.out.println("Golden Phoenix Financial Corporation: Blaze a path to better finances.");
                            nextScreen = false;
                            break; //exiting the loop? Hopefully that fully closes it?

                        default: //Error Message
                            System.out.println("Error: Incorrect input. Please try again.");
                            nextScreen = true;
                            break; }

                        //I forget to do this step constantly so here it is:
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