package repository.contracts;

import java.util.List;

import model.JournalEntry;

public interface RepoCRUDContract {

	public boolean saveJournalEntry(JournalEntry data);
	public List<JournalEntry> getList();
}
