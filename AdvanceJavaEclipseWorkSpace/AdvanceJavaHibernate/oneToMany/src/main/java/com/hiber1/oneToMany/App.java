package com.hiber1.oneToMany;

import java.util.Set;

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
    	
    	
    	Employee e = new Employee(25,"AnnaNaik",50030f);
    	Employee e1 = new Employee(26,"PndI",50010f);
    	Department d =  new Department(1,"Education");
    	Set<Employee> hset = d.getHset();
    	hset.add(e);
    	hset.add(e1);
    	
    	s.save(d);
    	s.save(e);
    	s.save(e1);
    	
    	
    	tr.commit();
    	s.close();
    	sf.close();
    }
}
