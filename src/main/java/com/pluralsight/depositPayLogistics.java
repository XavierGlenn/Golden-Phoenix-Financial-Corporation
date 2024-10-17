package com.pluralsight;

/*file writer, file reader add, split, convert. if split -> make add .object with stored info <- arraylist?, reference another constructor class.

    public static class depositpaylogistics(String date, String time, String description, String vendor, String type, double amount) {
        public void main() {
                this.date = date;
                this.time = time;
                this.description = description;
                this.vendor = vendor;
                this.type = type;
                this.amount = amount; }

            //Ready... Getters, Setters, Go!
            //Date Get-Set
            public String getDate () {return date;}
            public void setDate (String date) {this.date = date;}

            //Time Get-Set
            public String getTime () {return time;}
            public void setTime (String time){this.time = time;}

            //Description Get-Set
            public String getDescription () {return description;}
            public void setDescription (String description) { this.description = description; }

            //Vendor Get-Set
            public String getVendor() {return vendor;}
            public void setVendor (String vendor) {this.vendor = vendor;}

            //Type Get-Set
            public String getType () {return type;}

            public void setType () {this.type = type;}

            //Amount Get-Set
            public double getAmount () {return amount;}

            public void setAmount ( double amount) {this.amount = amount;}

            while () {
                private double balance;
                // Save the transaction to the list or file.
                // Add logic for each menu option.

//Step 5: Add Functionality for Deposits
//Task: Write a method to add a new deposit.
//Hint: Prompt the user for information such as description, vendor, and amount.
//Consider: What happens if the user enters a negative amount? How will you handle that?
//Example Guidance: Think about how you would store this data in a format that can be easily saved to a file.
/* parameters */
//Step 6: Add Functionality for Payments
//Task: Write a method to add a new payment.
//Hint: This method will be similar to the deposit method but will record the amount as a negative value.
//Consider: How will you ensure that payments are correctly saved as negative values?

/* Prompt the user.
Parse the input.
Validate that the amount is a positive number.*/

//https://skills4ittraining.sharepoint.com/:o:/r/sites/Opdrachtgevers/_layouts/15/Doc.aspx?sourcedoc=%7B901a5ac1-3af7-4752-9d89-980ae31fd3d1%7D&action=default&CID=0afe8e77-bd91-4fe2-ad21-b91d27efc074&_SRM=0%3AG%3A298
//Collections.sort(transactions, Comparator.comparing(Transaction::getDate));