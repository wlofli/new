package jinyou.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class HibernateTest {
	private static SessionFactory sf =null;
	private static Session getSession(){
		if(sf==null){
			Configuration config	=new Configuration();
			config.configure();
			sf=config.buildSessionFactory();
		}
	return sf.openSession();
		
	}
	public static void main(String[] args){
		Session session=HibernateTest.getSession();
		try {
			if(!session.connection().isClosed())
				System.out.println("suc database!");
			else {
				System.out.println("fail database!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	
		session.close();
	}

}
