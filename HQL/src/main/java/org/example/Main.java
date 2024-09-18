package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
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

//        Query query1 = session.createQuery("from Customer where cid = ?1");
//        query1.setParameter(1,1);
//        Customer customer = (Customer) query1.uniqueResult();
//        System.out.println(customer.getCid());
//        System.out.println(customer.getName());

            //insert
//            Query query2 = session.createQuery("insert into Customer(cid,name) values(?1,?2)");
//            query2.setParameter(1,3);
//            query2.setParameter(2,"ashan");
//            query2.executeUpdate();

            //update
//            Query query3 = session.createQuery("update Customer set name = ?1 where cid = ?2");
//            query3.setParameter(1,"Namal");
//            query3.setParameter(2,3);
//            query3.executeUpdate();

            //delete
//        Query query4 = session.createQuery("delete from Customer where cid = ?1");
//        query4.setParameter(1,3);
//        query4.executeUpdate();

        //-------------
//        Query query5 =session.createQuery("select cid,name from Customer where cid=?1");
//        query5.setParameter(1,1);
//        Object[] customer = (Object[]) query5.uniqueResult();
//        for(Object o : customer){
//            System.out.println(o);
//        }

        //-------------
//        Query query6 = session.createQuery("select cid, name from Customer");
//        List<Object[]>customers = query6.list();
//        for (Object[] objects : customers) {
//            System.out.println(Arrays.toString(objects));
//        }

        //Join
//        Query query7 = session.createQuery("select a.aid,a.road,c.name from Address a inner join Customer c on a.customer c");
//        List<Object[]>customers = query7.list();
//        for (Object[] objects : customers) {
//            System.out.println(Arrays.toString(objects));
//        }

        transaction.commit();
        session.close();
    }

}