package com.Test.SecondMaven;

public class TableFormat {
    public static void main(String[] args) {
        // Sample data (replace with your actual data)
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] places = {"New York", "London", "Tokyo"};
        String[] mobileNumbers = {"123-456-7890", "987-654-3210", "555-123-4567"};

        // Print table header
        System.out.format("%-15s %-20s %-15s%n", "Name", "Place", "Mobile Number");
        System.out.println("---------------------------------------------------");

        // Print data rows
        for (int i = 0; i < names.length; i++) {
            System.out.format("%-15s %-20s %-15s%n", names[i], places[i], mobileNumbers[i]);
        }
    }
}
