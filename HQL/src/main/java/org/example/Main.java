package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//         Query query = session.createQuery("from Customer");
//        List<Customer> customerList = query.list();
//        for (Customer customer : customerList){
//            System.out.println(customer.getCid());
//        }

        Query query1 = session.createQuery("from Customer where cid = ?1");
        query1.setParameter(1,1);
        Customer customer = (Customer) query1.uniqueResult();
        System.out.println(customer.getCid());
        System.out.println(customer.getName());

        Query query = session.createQuery("select cid,name from Customer where cid =?1");

        transaction.commit();
        session.close();
    }

}