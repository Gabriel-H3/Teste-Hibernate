package testehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate.cliente;


public class clienteTeste {
    
    public static void main(String[] args) {

        cliente cli = new cliente();
        cli.setNome("Testee");
        cli.setEmail("testandoessaporra@gmail.com");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(cli);
        session.getTransaction().commit();
        session.close();
        
          
    }
}

