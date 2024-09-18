package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //select
        NativeQuery query = session.createNativeQuery("select * from customer");
        query.addEntity(Customer.class);
        List<Customer> customerList = query.list();
        for (Customer customer:customerList){
            System.out.println(customer);
        }

        //insert
//        NativeQuery query2 = session.createNativeQuery("insert into customer values(?1,?2)");
//        query2.setParameter(1,2);
//        query2.setParameter(2,"Kavindu");
//        query2.executeUpdate();

        //update
//        NativeQuery query3 = session.createNativeQuery("update customer set name =?1 where cid =?2");
//        query3.setParameter(1,"Kavindu");
//        query3.setParameter(2,1);
//        query3.executeUpdate();

        //delete
//        NativeQuery query4 = session.createNativeQuery("delete from customer where cid = ?1");
//        query4.setParameter(1,2);
//        query4.executeUpdate();

        //search
//        NativeQuery query5 = session.createNativeQuery("select * from customer where name = ?1");
//        query5.addEntity(Customer.class);
//        query5.setParameter(1,"kavindu");
//        Customer customer = (Customer) query5.uniqueResult();
//        System.out.println(customer);

        transaction.commit();
        session.close();
    }
}