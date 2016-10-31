package parser.com.xml.main;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import parser.com.xml.model.InventorysModel;
import parser.com.xml.processor.XMLProcessor;
import parser.com.xml.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		XMLProcessor processor=new XMLProcessor();
		Set<InventorysModel> modelList=processor.getInventorysObect();
		try{
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			for(InventorysModel model:modelList){
				session.save(model);
			}
			tx.commit();
			session.close();
			System.out.println("completed");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
