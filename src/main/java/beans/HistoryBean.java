package main.java.beans;

import main.java.db.DatabaseExtractor;
import main.java.db.DatabaseInserter;

import javax.faces.annotation.ManagedProperty;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class HistoryBean implements Serializable {
    @ManagedProperty(value = "#{entryBean}")
    private EntryBean entryBean;

    private List<EntryBean> history;

    public HistoryBean() {
    }

    public List<EntryBean> getHistory() {
        return history;
    }

    public void setHistory(List<EntryBean> history) {
        this.history = history;
    }

    public void extractHistory() throws SQLException {
        DatabaseExtractor databaseExtractor = new DatabaseExtractor();
        List<EntryBean> hist = databaseExtractor.getHistoryList();
        setHistory(hist);
    }

    public void addEntry() throws SQLException {
        DatabaseInserter databaseInserter = new DatabaseInserter();
        databaseInserter.addEntry(entryBean);
        history.add(entryBean);
        System.out.println("added" + entryBean.getX());
    }
}
