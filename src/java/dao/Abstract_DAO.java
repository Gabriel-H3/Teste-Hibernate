
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

    public abstract class Abstract_DAO {
    ///public Session session;
    
    public Abstract_DAO(){
       SessionFactory factory = HibernateUtil.getFactory();
       //session = factory.openSession();
    }
    
    public abstract void insert(Object objeto);
    public abstract void update(Object objeto);
    public abstract void delete(Object objeto);
    public abstract Object list(int codigo);
    public abstract List listAll();
}
