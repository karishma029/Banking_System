package org.example.model;

public class Customer {

    private int customerId;
    private String customerName;
    private String mobile;
    private String email;
    private String address;

    private Account account;

    public Customer(int customerId,
                    String customerName,
                    String mobile,
                    String email,
                    String address,
                    Account account) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
            return email;
    }

    public String getAddress() {
        return address;
    }

    public Account getAccount() {
        return account;
    }
}