package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //select
//        Query query1 = session.createQuery("select c from Customer c");
//        List<Customer> customers = query1.list();
//        for(Customer customer : customers){
//            System.out.println(customer);
//        }

        //delete
//        Query query2 = session.createQuery("delete from Customer c where c.cid = :id");
//        query2.setParameter("id",3);
//        query2.executeUpdate();

        //update
//        Query query3 = session.createQuery("update Customer c set c.name = :name where c.cid = :id");
//        query3.setParameter("name", "Lakshan");
//        query3.setParameter("id", 1);
//        query3.executeUpdate();

        //search
//        Query query4 = session.createQuery("select  c.name from Customer c");
//        List<String> customers = query4.list();
//        for (String customer : customers) {
//            System.out.println(customer);
//        }
        //join
//        Query query5 = session.createQuery("select c.cid,c.name,a.city,a.road from Address a join a.customer c");
//        List<Object[]> customers = query5.list();
//        for (Object[] customer : customers) {
//            System.out.println(Arrays.toString(customer));
//        }

        transaction.commit();
        session.close();
    }
}