package org.example.service;

import org.example.model.Account;
import org.example.repository.BankRepository;

public class BankService {

    private BankRepository repository = new BankRepository();

    public void createAccount(Account account) {

        repository.saveAccount(account);

        System.out.println("Account Created Successfully...");
    }

    public void deposit(String accountNumber, double amount) {

        Account account = repository.findAccount(accountNumber);

        if (account != null) {

            account.setBalance(account.getBalance() + amount);

            System.out.println("Deposit Successful");
            System.out.println("Available Balance : " + account.getBalance());

        } else {

            System.out.println("Account Not Found");
        }

    }

    public void withdraw(String accountNumber, double amount) {

        Account account = repository.findAccount(accountNumber);

        if (account != null) {

            if (account.getBalance() >= amount) {

                account.setBalance(account.getBalance() - amount);

                System.out.println("Withdraw Successful");
                System.out.println("Available Balance : " + account.getBalance());

            } else {

                System.out.println("Insufficient Balance");
            }

        } else {

            System.out.println("Account Not Found");
        }

    }

    public void checkBalance(String accountNumber) {

        Account account = repository.findAccount(accountNumber);

        if (account != null) {

            System.out.println("----------------------");
            System.out.println("Account Holder : " + account.getAccountHolderName());
            System.out.println("Balance : " + account.getBalance());

        } else {

            System.out.println("Account Not Found");
        }

    }

    public BankRepository getRepository() {
        return repository;
    }

}