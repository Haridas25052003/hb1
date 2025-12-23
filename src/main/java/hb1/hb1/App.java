package hb1.hb1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure();
        
        SessionFactory sf=con.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();
        
        
        Student s=new Student();
        
        //add always the new names so it will add in database
        s.setName("Haridas Shinde");
        s.setCity("Pangra Shinde");
        s.setPercentage(90.00);
        
        session.save(s);
        tx.commit();
        
        session.close();
    }
}
