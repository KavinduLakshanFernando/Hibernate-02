package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCid(1);
        customer.setName("Rukshan");

        Address address = new Address();
        address.setAid(1);
        address.setNo("231/5");
        address.setRoad("Dapiligoda");
        address.setCity("Kalutara");
        address.setCustomer(customer);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);
        session.save(address);
        transaction.commit();
        session.close();
    }
}