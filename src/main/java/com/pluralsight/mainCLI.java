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

            try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Student/OneDrive - Year Up- BOS/Desktop/Year Up Courses/PluralSight/Year Up United Projects/LearnToCode_Capstones/CapstoneBankBanner.txt"))) {
                String line; }
            catch (IOException e) {
                throw new RuntimeException(e); }

                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);

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

                while(nextScreen); {
                    char option = scanner.nextLine().toUpperCase().charAt(0);

                    boolean nextScreen;
                    boolean newDeposit;
                    boolean newPayment;
                    boolean ledgerScreen;

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
                            break;

                            scanner.close();
                    }
                }
            }
        }
    }

//Step 13: Validate User Input
//Task: Ensure that user input is validated throughout the application. Check for valid amounts, dates, and other data.
//Consider: How will you handle input errors gracefully without crashing the program? What kind of error messages would be helpful to users?

//Step 14: Final Testing and Debugging
//Task: Test the entire application, focusing on edge cases like an empty CSV file or invalid user input. Add print statements to trace where things might be going wrong during testing. How will you ensure the application handles unexpected scenarios?
//Add to README, ADD A SCREENSHOT OF YOUR PROGRAM WORKING!!! upload to GitHub. Make it public.
