package main.java.beans;

import main.java.db.DatabaseExtractor;

import java.io.Serializable;
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
}
