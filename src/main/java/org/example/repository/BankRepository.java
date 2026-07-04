package org.example.repository;

import org.example.model.Account;

import java.util.HashMap;

public class BankRepository {

    private HashMap<String, Account> accounts = new HashMap<>();

    public void saveAccount(Account account) {

        accounts.put(account.getAccountNumber(), account);

    }

    public Account findAccount(String accountNumber) {

        return accounts.get(accountNumber);

    }

    public void displayAllAccounts() {

        for (Account account : accounts.values()) {

            System.out.println("----------------------------");

            System.out.println("Account Number : " + account.getAccountNumber());

            System.out.println("Holder Name    : " + account.getAccountHolderName());

            System.out.println("Bank Name      : " + account.getBankName());

            System.out.println("Balance        : " + account.getBalance());

        }

    }

}