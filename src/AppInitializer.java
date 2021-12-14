import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Powered By:MINDARTLK.
 * Date:2021/12/04
 */

public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("S001");
        customer.setName("ashan");
        customer.setAddress("galle");
        customer.setSalary(34500);

        Customer c2 = new Customer();
        c2.setId("S002");
        c2.setName("amesh");
        c2.setAddress("galle");
        c2.setSalary(34562);

        Session s1 = FactoryConfig.getInstance().getSession();
        Transaction transaction = s1.beginTransaction();
//        s1.delete(c2);
        Customer s001 = s1.get(Customer.class, "S001");
        System.out.println(s001.getId());
        transaction.commit();
        s1.close();
    }
}
