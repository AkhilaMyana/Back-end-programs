package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
public class HibernateManager {
    private static Session session;
    public boolean connect() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());                  
        session =sessionFactory.openSession();    
        if(session!=null) {
            System.out.println("Connected to the mysql database");
            return true;
        }
        else {
            System.out.println("Could not connect to the mysql database");
            return false;
        }
    }
}
