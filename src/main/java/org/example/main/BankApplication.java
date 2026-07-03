package org.example.main;

import org.example.model.Account;
import org.example.model.Transaction;
import org.example.service.BankService;
import org.example.service.TransferService;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankService bankService = new BankService();

        while (true) {

            System.out.println("\n==============================");
            System.out.println("      BANK APPLICATION");
            System.out.println("==============================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Accounts");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Account Number : ");
                    String accNo = sc.nextLine();

                    System.out.print("Holder Name : ");
                    String holder = sc.nextLine();

                    System.out.print("Bank Name : ");
                    String bank = sc.nextLine();

                    System.out.print("IFSC : ");
                    String ifsc = sc.nextLine();

                    System.out.print("Branch : ");
                    String branch = sc.nextLine();

                    System.out.print("Opening Balance : ");
                    double balance = sc.nextDouble();

                    Account account = new Account(
                            accNo,
                            holder,
                            bank,
                            ifsc,
                            branch,
                            balance);

                    bankService.createAccount(account);

                    break;

                case 2:

                    System.out.print("Account Number : ");
                    String depAcc = sc.next();

                    System.out.print("Amount : ");
                    double dep = sc.nextDouble();

                    bankService.deposit(depAcc, dep);

                    break;

                case 3:

                    System.out.print("Account Number : ");
                    String withAcc = sc.next();

                    System.out.print("Amount : ");
                    double with = sc.nextDouble();

                    bankService.withdraw(withAcc, with);

                    break;

                case 4:

                    System.out.print("Sender Account : ");
                    String sender = sc.next();

                    System.out.print("Receiver Account : ");
                    String receiver = sc.next();

                    System.out.print("Amount : ");
                    double amount = sc.nextDouble();

                    TransferService transferService =
                            new TransferService(bankService.getRepository());

                    Transaction t = transferService.transferMoney(
                            sender,
                            receiver,
                            amount);

                    if (t != null) {

                        System.out.println("\n========== RECEIPT ==========");

                        System.out.println("UTR : " + t.getUtrId());

                        System.out.println("Sender : "
                                + t.getSender().getAccountHolderName());

                        System.out.println("Receiver : "
                                + t.getReceiver().getAccountHolderName());

                        System.out.println("Amount : ₹"
                                + t.getAmount());

                        System.out.println("Date : "
                                + t.getTransactionDateTime());

                        System.out.println("Status : "
                                + t.getStatus());

                    }

                    break;

                case 5:

                    System.out.print("Account Number : ");

                    bankService.checkBalance(sc.next());

                    break;

                case 6:

                    bankService.getRepository().displayAllAccounts();

                    break;

                case 7:

                    System.out.println("Thank You...!");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }

}