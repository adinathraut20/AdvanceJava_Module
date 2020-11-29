package com.cdac.manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Department;
import com.dto.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure();
    	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
    	ssrb.applySettings(cfg.getProperties());
    	StandardServiceRegistry ssr = ssrb.build();
    	SessionFactory sf = cfg.buildSessionFactory(ssr);
    	Session s = sf.openSession();
    	Transaction tr = s.beginTransaction();
    	
    	Department d = new Department(6,"Finance");
    	Employee e = new Employee(38,"Aka",100000,d);
    	Employee e1 = new Employee(37,"Adi",100500,d);
    	
    	//Department d =  (Department)s.get(Department.class,2);
    	//Employee e = new Employee(14,"Ando",50030f,d);
    	
    	s.save(e);
    	s.save(e1);
    	//s.save(d);
    	
    	tr.commit();
    	s.close();
    	sf.close();
    	return;
    	
    }
}
