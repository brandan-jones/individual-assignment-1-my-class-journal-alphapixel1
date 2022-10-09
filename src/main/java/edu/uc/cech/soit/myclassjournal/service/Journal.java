package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Journal implements IJournalService{
    private List<JournalEntry> journalEntries=new ArrayList<>();

    /**
     * Saves the entry to the journal
     * @param journalEntry the entry to save.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    /**
     * Fetches all Journal entries
     * @return a list of all journal entries
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
