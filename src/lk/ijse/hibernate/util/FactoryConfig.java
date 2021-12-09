/**
 * Powered By:MINDARTLK.
 * Date:2021/12/04
 */

package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfig {
    private static FactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;

    private FactoryConfig() {
        Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory = con.buildSessionFactory();
    }

    public static FactoryConfig getInstance() {
        return factoryConfig == null ? factoryConfig = new FactoryConfig() : factoryConfig;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}