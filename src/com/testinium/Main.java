package com.testinium;

import com.testinium.business.Deposit;
import com.testinium.business.Withdraw;
import com.testinium.model.CorporateCustomer;
import com.testinium.model.IndividualCustomer;
import com.testinium.model.base.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Please enter your identity number: ");
        Long identityNumber = scanner.nextLong();

        Iterator<Map.Entry<Long, Customer>> iterator = customers.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Customer> entry = iterator.next();

            if (identityNumber.equals(entry.getKey())) {
                found = true;

                System.out.println(entry.getValue());

                System.out.println("Choose an option");
                System.out.println("1- Withdraw");
                System.out.println("2- Deposit");
                System.out.println("3- Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Please enter amount: ");
                        double amount = scanner.nextDouble();
                        Withdraw withdraw = new Withdraw();
                        withdraw.withdraw(entry.getValue(), amount);
                        System.out.println(entry.getValue());
                        break;
                    case 2:
                        System.out.println("Please enter amount: ");
                        double amount2 = scanner.nextDouble();
                        Deposit deposit = new Deposit();
                        deposit.deposit(entry.getValue(), amount2);
                        System.out.println(entry.getValue());
                        break;
                    case 3:
                    default:
                        break;
                }
            }
        }

        if (!found) {
            System.out.println("Customer not found");
        }
    }

    static Map<Long, Customer> customers = new HashMap<Long, Customer>();

    static {
        Customer customer1 = new IndividualCustomer(1L, "Tugba1", "Yavuz1", 1500.00, "Avcilar");
        Customer customer2 = new IndividualCustomer(2L, "Tugba2", "Yavuz2", 2500.00, "Avcilar");
        Customer customer3 = new IndividualCustomer(3L, "Tugba3", "Yavuz3", 3500.00, "Avcilar");
        Customer customer4 = new CorporateCustomer(4L, "Tugba4", "Yavuz4", 4500.00, "Testinium");
        Customer customer5 = new CorporateCustomer(5L, "Tugba5", "Yavuz5", 5500.00, "Loadium");

        customers.put(customer1.getIdentityNumber(), customer1);
        customers.put(customer2.getIdentityNumber(), customer2);
        customers.put(customer3.getIdentityNumber(), customer3);
        customers.put(customer4.getIdentityNumber(), customer4);
        customers.put(customer5.getIdentityNumber(), customer5);
    }
}
