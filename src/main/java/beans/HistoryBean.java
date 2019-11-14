package main.java.beans;

import main.java.db.DatabaseExtractor;
import main.java.db.DatabaseInserter;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HistoryBean implements Serializable {
    private List<EntryBean> history;

    public HistoryBean() {
    }

    public List<EntryBean> getHistory() {
        return history;
    }

    public void setHistory(List history) {
        this.history = history;
    }

    public void extractHistory() {
        DatabaseExtractor databaseExtractor = new DatabaseExtractor();
        List<EntryBean> hist = databaseExtractor.getHistoryList();
        setHistory(hist);
    }

    public void addEntry(EntryBean entryBean) throws SQLException {
        DatabaseInserter databaseInserter = new DatabaseInserter();
        databaseInserter.addEntry(entryBean);
        history.add(entryBean);
    }
}
