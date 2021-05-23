package com.testinium.business;

import com.testinium.model.base.Customer;

public class Withdraw {

    public void withdraw(Customer customer, double amount) {
        double balance = customer.getAccountBalance() - amount;
        customer.setAccountBalance(balance);
    }

}
