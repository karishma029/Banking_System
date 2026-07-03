package org.example.util;

public class Validation {

    // Account Number Validation
    public static boolean isValidAccountNumber(String accountNumber) {

        return accountNumber != null
                && accountNumber.matches("\\d{10}");
    }

    // Name Validation
    public static boolean isValidName(String name) {

        return name != null
                && !name.trim().isEmpty();
    }

    // Deposit Validation
    public static boolean isValidDeposit(double amount) {

        return amount > 0;
    }

    // Withdraw Validation
    public static boolean isValidWithdraw(double balance, double amount) {

        return amount > 0 && balance >= amount;
    }

    // Transfer Validation
    public static boolean isValidTransfer(double balance, double amount) {

        return amount > 0 && balance >= amount;
    }

    // Minimum Balance Validation
    public static boolean hasMinimumBalance(double balance) {

        return balance >= 1000;
    }

}