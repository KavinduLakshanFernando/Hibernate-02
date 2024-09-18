package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Address> addresses = new ArrayList<>();
        Customer customer = new Customer();

        customer.setCid(1);
        customer.setName("Rukshan");
        customer.setAddresses(addresses);

        Address address = new Address();
        address.setAid(1);
        address.setNo("231/5");
        address.setRoad("Dapiligoda");
        address.setCity("Kalutara");
        address.setCustomer(customer);

        Address address2 = new Address();
        address2.setAid(2);
        address2.setNo("232");
        address2.setRoad("Yatiyana");
        address2.setCity("Mathugama");
        address2.setCustomer(customer);

        addresses.add(address2);
        addresses.add(address);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);
        session.save(address);
        session.save(address2);
        transaction.commit();
        session.close();
    }
}