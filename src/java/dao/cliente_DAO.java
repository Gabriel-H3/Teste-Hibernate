
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class cliente_DAO extends Abstract_DAO{
    
    private SessionFactory factory;
    private Session session;
    
    
    @Override
    public void insert(Object objeto) {
      factory = HibernateUtil.getFactory();  
      session = factory.openSession();
      session.beginTransaction();
      session.save(objeto);
      session.getTransaction().commit();
      session.close();
        
    }

    @Override
    public void update(Object objeto) {
        factory = HibernateUtil.getFactory();  
        session = factory.openSession();
        session.beginTransaction();
        session.update(objeto);
        session.flush();
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Object objeto) {
        factory = HibernateUtil.getFactory();  
        session = factory.openSession();
        session.beginTransaction();
        session.delete(objeto);
        session.flush();
        session.getTransaction().commit();
        session.close();
        
    }

    @Override
    public Object list(int codigo) {
        return 0;
    }

    @Override
    public List listAll() {
        
        return null;
        
    }
    
}
