package org.example.service;

import org.example.model.Account;
import org.example.model.Transaction;
import org.example.repository.BankRepository;
import org.example.util.Constants;
import org.example.util.DateTimeUtil;

public class TransferService {

    private BankRepository repository;

    public TransferService(BankRepository repository) {
        this.repository = repository;
    }

    public Transaction transferMoney(String senderAcc,
                                     String receiverAcc,
                                     double amount) {

        // Find Sender Account
        Account sender = repository.findAccount(senderAcc);

        // Find Receiver Account
        Account receiver = repository.findAccount(receiverAcc);

        // Validate Accounts
        if (sender == null || receiver == null) {
            System.out.println("Invalid Account Number!");
            return null;
        }

        // Check Balance
        if (sender.getBalance() < amount) {
            System.out.println("Insufficient Balance!");
            return null;
        }

        // Update Balances
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        // Generate Transaction ID & UTR ID
        String transactionId = UTRGenerator.generateTransactionId();
        String utrId = UTRGenerator.generateUTR();

        // Create Transaction
        Transaction transaction = new Transaction(
                transactionId,
                utrId,
                sender,
                receiver,
                amount,
                DateTimeUtil.getCurrentDateTime(),
                Constants.SUCCESS
        );

        // Display Transaction Details
        System.out.println("\n========== TRANSACTION SUCCESS ==========");
        System.out.println("Transaction ID : " + transaction.getTransactionId());
        System.out.println("UTR ID         : " + transaction.getUtrId());
        System.out.println("Sender Account : " + sender.getAccountNumber());
        System.out.println("Receiver Acc   : " + receiver.getAccountNumber());
        System.out.println("Amount         : ₹" + transaction.getAmount());
        System.out.println("Date & Time    : " + transaction.getTransactionDateTime());
        System.out.println("Status         : " + transaction.getStatus());
        System.out.println("=========================================\n");

        return transaction;
    }
}