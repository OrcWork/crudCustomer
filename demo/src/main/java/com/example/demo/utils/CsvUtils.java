package com.example.demo.utils;

import com.example.demo.customer.Customer;

import java.util.List;

public class CsvUtils {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static String convertToCsv(List<Customer> users) {
        StringBuilder csvData = new StringBuilder();

        csvData.append("ID,Name,Email").append(NEW_LINE_SEPARATOR);

        for (Customer user : users) {
            csvData.append(user.getId()).append(COMMA_DELIMITER);
            csvData.append(user.getName()).append(COMMA_DELIMITER);
            csvData.append(user.getEmail()).append(NEW_LINE_SEPARATOR);
        }

        return csvData.toString();
    }
}
