package com.testinium.model.base;

public class Customer {
    private Long identityNumber;
    private String firstName;
    private String lastName;
    private double accountBalance;

    public Customer() {
    }

    public Customer(Long identityNumber, String firstName, String lastName, double accountBalance) {
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identityNumber=" + identityNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
