package main.java.beans;

import main.java.db.DatabaseExtractor;

import java.io.Serializable;
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

    public void populate() {
        history = new ArrayList<>();
        EntryBean e1 = new EntryBean(1, 2, 3, true);
        EntryBean e2 = new EntryBean(2, 3, 4, false);
        history.addAll(Arrays.asList(e1, e2));
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
