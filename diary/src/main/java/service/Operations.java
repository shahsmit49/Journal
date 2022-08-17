package service;

import java.util.Date;
import java.util.List;

import model.JournalEntry;
import repository.RepoCRUD;
import service.contracts.OperationsContract;

public class Operations implements OperationsContract {
	
	// singleton
	private static Operations operationsInstance = null;
	private Operations() {
		
	}
	public static Operations getInstance() {
		if(operationsInstance == null) {
			operationsInstance = new Operations();
		}
		return operationsInstance;
	}
	
	@Override
	public JournalEntry saveJournalEntry(JournalEntry data) {
		// TODO Auto-generated method stub
		data.setDelete(false);
		data.setDate(new Date());
		return RepoCRUD.getInstance().saveJournalEntry(data);
	}

	@Override
	public List<JournalEntry> getList() {
		// TODO Auto-generated method stub
		return RepoCRUD.getInstance().getList();
	}

}
