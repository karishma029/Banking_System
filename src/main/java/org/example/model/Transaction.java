package org.example.model;

public class Transaction {

    private String transactionId;
    private String utrId;
    private Account sender;
    private Account receiver;
    private double amount;
    private String transactionDateTime;
    private String status;

    public Transaction(String transactionId,
                       String utrId,
                       Account sender,
                       Account receiver,
                       double amount,
                       String transactionDateTime,
                       String status) {

        this.transactionId = transactionId;
        this.utrId = utrId;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.transactionDateTime = transactionDateTime;
        this.status = status;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public String getUtrId() {
        return utrId;
    }

    public Account getSender() {
        return sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "==============================\n" +
                "Transaction ID : " + transactionId + "\n" +
                "UTR ID         : " + utrId + "\n" +
                "Sender Acc No  : " + sender.getAccountNumber() + "\n" +
                "Receiver Acc No: " + receiver.getAccountNumber() + "\n" +
                "Amount         : " + amount + "\n" +
                "Date & Time    : " + transactionDateTime + "\n" +
                "Status         : " + status + "\n" +
                "==============================";
    }
}