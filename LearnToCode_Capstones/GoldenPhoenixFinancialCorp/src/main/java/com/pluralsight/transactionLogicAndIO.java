package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

//make the transaction variable and document it'll read from.
public class transactionLogicAndIO extends Transaction {
    private Object description;
    private Object vendor;
    private Object type;
    private LocalDate date;
    private LocalTime time;
    private double amount;

    public transactionLogicAndIO() {

        class depositpaylogistics {

            //Ready... Getters, Setters, Go!
            //Date Get-Set
            public String getDate() {
                return String.valueOf(date);
            }

            public void setDate(String date) {
                time = LocalTime.parse(getTime()); }


            //Time Get-Set
            public String getTime() {
                return String.valueOf(time);
            }

            public void setTime(String time) {
                date = LocalDate.from(LocalTime.parse(getTime())); }


            //Description Get-Set
            public String getDescription() {
                return String.valueOf(description);
            }

            public void setDescription(String description) {
                description = getDescription();
            }


            //Vendor Get-Set
            public String getVendor() {
                return String.valueOf(vendor);
            }

            public void setVendor(String) {
                vendor = getVendor();
            }


            //Type Get-Set
            public String getType(String) {
                return String.valueOf(type);
            }

            public void setType(String) {
                type = getType();
            }


            //Amount Get-Set
            public double getAmount() {
                return Double.parseDouble();
            }

            public void setAmount(Double amount) {
                amount = getAmount();
            }
        }
    }
}