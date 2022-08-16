package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.JournalEntry;
import repository.contracts.RepoCRUDContract;
import service.SessionFactory;

public class RepoCRUD implements RepoCRUDContract {
	
	//Singleton
	private static RepoCRUD repoCRUDInstance = null;
	private static Session sessionObj = SessionFactory.buildSessionFactory().openSession();
	private static String databaseName = "journal_entry";
	private RepoCRUD() {
			
	}
	public static RepoCRUD getInstance() {
		if(repoCRUDInstance == null) {
			repoCRUDInstance = new RepoCRUD();
		}
		return repoCRUDInstance;
	}

	public boolean saveJournalEntry(JournalEntry data) {
		// TODO Auto-generated method stub
		try {
			sessionObj.beginTransaction();
	        sessionObj.save(data);
	        sessionObj.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}

	public List<JournalEntry> getList() {
		// TODO Auto-generated method stub
		Query query = sessionObj.createQuery("from "+"JournalEntry");
		List<JournalEntry> journalList = query.list();
		return journalList;
	}

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		sessionObj.close();
	}

}
