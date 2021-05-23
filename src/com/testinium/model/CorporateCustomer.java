package com.testinium.model;

import com.testinium.model.base.Customer;

public class CorporateCustomer extends Customer {

    private String companyName;

    public CorporateCustomer(String companyName) {
        this.companyName = companyName;
    }

    public CorporateCustomer(Long identityNumber, String firstName, String lastName, double accountBalance, String companyName) {
        super(identityNumber, firstName, lastName, accountBalance);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}
