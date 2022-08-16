package service.contracts;

import java.util.List;

import model.JournalEntry;

public interface OperationsContract {

	public boolean saveJournalEntry(JournalEntry data);
	public List<JournalEntry> getList();
}
