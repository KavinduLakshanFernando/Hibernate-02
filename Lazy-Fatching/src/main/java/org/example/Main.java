package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer1 = session.get(Customer.class,1);
        System.out.println(customer1.getCid());
//        System.out.println(customer1.getAddresses());

        transaction.commit();
        session.close();
    }
}