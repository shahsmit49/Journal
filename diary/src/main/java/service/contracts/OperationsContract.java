package service.contracts;

import java.util.List;

import model.JournalEntry;

public interface OperationsContract {

	public JournalEntry saveJournalEntry(JournalEntry data);
	public List<JournalEntry> getList();
}
