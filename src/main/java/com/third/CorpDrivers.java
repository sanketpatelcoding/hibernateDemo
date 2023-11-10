package com.third;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import com.third.Corporations;

public class CorpDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Corporations corp =new Corporations();
	corp.setName("adani");
	corp.setAddress("gujarat");
	corp.setEmployeeCount(700);
	corp.setCeoName("gautam");
		
	
	Configuration conf =new Configuration().configure().addAnnotatedClass(Corporations.class);
	SessionFactory sf=conf.buildSessionFactory();
	Session sesn=sf.openSession();
	Transaction tx =sesn.beginTransaction();
	//Commentthis toshow fetching
	//sesn.save(corp); 
		tx.commit();
	 
		
	corp=	(Corporations) sesn.get(Corporations.class, 2);
		
		
		/*fetch data*/
		System.out.println(corp);
		
	}
	

}




/*
 * create Sesssion then create SEssion Factory then 
 * inform which dialiect you  wantto workwith 
 * means which database and which table and all.
 * 
 * */
 