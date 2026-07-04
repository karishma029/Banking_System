package org.example.service;

import java.util.UUID;

public class UTRGenerator {

    public static String generateTransactionId() {
        return "TXN" + UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 10)
                .toUpperCase();
    }

    public static String generateUTR() {
        return "UTR" + UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 12)
                .toUpperCase();
    }
}