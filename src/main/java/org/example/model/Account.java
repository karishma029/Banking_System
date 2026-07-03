package org.example.model;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private String ifscCode;
    private String branch;
    private double balance;

    public Account(String accountNumber,
                   String accountHolderName,
                   String bankName,
                   String ifscCode,
                   String branch,
                   double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branch = branch;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}