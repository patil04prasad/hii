package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory ss=cfg.buildSessionFactory();
		
		Session s=ss.openSession();
		
		Stud s1=new Stud();
		s1.setR(1);
		s1.setN("Avi");
		
		s.save(s1);
		s.beginTransaction().commit();
	}
}
