package com.testinium.business;

import com.testinium.model.base.Customer;

public class Deposit {

    public void deposit(Customer customer, double amount) {
        double balance = customer.getAccountBalance() + amount;
        customer.setAccountBalance(balance);
    }
}
