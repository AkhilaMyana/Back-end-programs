package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
public class HibernateManager3 {
    private static Session session;
    public static ArrayList al1 = new ArrayList();
    public static ArrayList al2 = new ArrayList();
    public static ArrayList al3 = new ArrayList();
    public static ArrayList al4 = new ArrayList();
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
    public ArrayList getData() {
        Transaction ref = session.beginTransaction();
        Query q = session.createQuery("from Finance");
        List list = q.list();
        Iterator itr = list.iterator();
        while (itr.hasNext()==true) {
        	Finance f = (Finance)itr.next();
          /*  al1.clear();
            al2.clear();
            al3.clear();
            al4.clear();*/
            al1.add(f.getId());
            al2.add(f.getFtype());
            al3.add(f.getName());
            al4.add(f.getProduct_id());
            
        }
        return al1;
    }
}

