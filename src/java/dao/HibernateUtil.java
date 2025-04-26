/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class HibernateUtil {
    
   private static final SessionFactory factory;
    
    
    static{
        
        try{
        
           factory = new Configuration().configure().buildSessionFactory();
        
        } catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    
    }
    
      public static SessionFactory getFactory(){
        return factory;
    }
      
   
}
