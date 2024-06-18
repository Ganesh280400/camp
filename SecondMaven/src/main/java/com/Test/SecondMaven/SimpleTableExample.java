package com.Test.SecondMaven;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class SimpleTableExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a frame
                JFrame frame = new JFrame("Simple Table ");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Column names
                String[] columnNames = {"Column 1", "Column 2", "Column 3"};

                // Data for the table
                Object[][] data = {
                    {"ganesh", "hyd", "hyd2"},
                    {"chaitanya", "ap", "ap2"},
                    {"Row3-Col1", "Row3-Col2", "Row3-Col3"}
                };

                // Create a table with the data
                JTable table = new JTable(data, columnNames);

                // Add the table to a scroll pane
                JScrollPane scrollPane = new JScrollPane(table);
                frame.add(scrollPane);

                // Set the frame size and make it visible
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        });
    }
}


