package com.testinium.model;

import com.testinium.model.base.Customer;

public class IndividualCustomer extends Customer {
    private String address;

    public IndividualCustomer(String address) {
        this.address = address;
    }

    public IndividualCustomer(Long identityNumber, String firstName, String lastName, double accountBalance, String address) {
        super(identityNumber, firstName, lastName, accountBalance);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
