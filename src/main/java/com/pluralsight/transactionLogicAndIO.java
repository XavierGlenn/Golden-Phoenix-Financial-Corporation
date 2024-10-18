package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

//make the transaction variable and document it'll read from.
public class transactionLogicAndIO {
    private Object description;
    private Object vendor;
    private Object type;
    private LocalDate date;
    private LocalTime time;
    private double amount;

    public transactionLogicAndIO(LocalDate date, LocalTime time, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.type = type;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    //Does this need the override here? I think so?
    @Override
    public String toString() {
        return date + "," + time + ", " + amount; }}