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

        Address address1 = new Address();
        address1.setAid(1);
        address1.setNo("231/5");
        address1.setRoad("Dapiligoda");
        address1.setCity("Kalutara");
//        address1.setCustomer(customer1);

        Address address2 = new Address();
        address2.setAid(2);
        address2.setNo("232");
        address2.setRoad("Yatiyana");
        address2.setCity("Mathugama");
//        address2.setCustomer(customer2);

        addresses.add(address2);
        addresses.add(address1);

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setCid(1);
        customer1.setName("Rukshan");
        customer1.setAddresses(addresses);

        Customer customer2 = new Customer();
        customer2.setCid(2);
        customer2.setName("Kaveesha");
        customer2.setAddresses(addresses);

        customers.add(customer1);
        customers.add(customer2);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(address1);
        session.save(address2);
        session.save(customer1);
        session.save(customer2);

        transaction.commit();
        session.close();
    }
}