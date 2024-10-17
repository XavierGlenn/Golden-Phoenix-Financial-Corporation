package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

//make the transaction variable and document it'll read from.
public class transaction {
    private LocalDate date;
    private LocalTime time;
    private double amount;

    public transaction(LocalDate date, LocalTime time, double amount) {
        this.date = date;
        this.time = time;
        this.amount = amount; }

    public LocalDate getDate()
    { return date; }
    public LocalTime getTime()
    { return time; }
    public double getAmount()
    { return amount; }

    //Does this need the override here? I think so?
    @Override
    public String toString() {
        return date + "," + time + ", " + amount;

        class csvReading {
            public static void list(transaction) readTransactionsInCSV(String filename) {
                list(transaction) ArrayList<Object> transactions = new ArrayList<>();

                //try-catch with buffer reader again:
                try BufferedReader reader = new BufferedReader(new FileReader(filename)) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(",");
                        LocalDate date = LocalDate.parse(fields[0]);
                        LocalTime time = LocalTime.parse(fields[1]);
                        double amount = Double.parseDouble(fields[2]);
                        transaction.add(new transaction(date, time, amount));
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while trying to access and read this file. Please try again.");
                    e.printStackTrace();
                    return transactions; }


        class csvWriting {

            public static void writetTransactionsInCSV(List<transaction> transactions, String filename) {
                try (FileWriter writer = new FileWriter(filename, true)) { //Do the appends
                    for (transaction transaction = new transaction) {
                        writer.write(transaction.toString() + "\n"); }
                    } catch (IOException e) {
                    System.out.println("An error occurred. Please try again.");
                    e.printStackTrace(); }

                Transaction deposit = TransactionHandler.addDeposit();
                transaction.add(deposit);

                Transaction payment = TransactionHandler.addPayment();
                transaction.add(payment);

                csvWriting.writetTransactionsInCSV(transactions, "transactions.csv");

                //have to make sure we can actually see the thing now.
public class displayingLedger {
    public static void displayTransactions(List<Transaction> transactions) {
        for (Transaction transaction = transactions) {
            System.out.println("Date: " + transactions.getDate() + ", Time: " + transactions.getTime() + ", in the amount of: " + transaction.getAmount()); }


public class sortingTransactions {
        //I don't like this code. I get it, I get why it works, but I don't like it. It unsettles me. It's intimidating.
        public static void sortingTransactionsByDate(List(transaction) transactions) {
            Collections.sort(transactions, Comparator.comparing(transaction: getDate)); }


//if I have time:
// Open the file in append mode.
// Write the record and a newline.
//Handle exceptions for file operations.