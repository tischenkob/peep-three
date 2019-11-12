package main.java.db;

import main.java.beans.EntryBean;

import java.sql.Connection;
import java.util.List;

public class DatabaseExtractor {

    {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.getConnection();
    }

    public List<EntryBean> getHistoryList() {
        // TODO тут добываем список точек
        return null;
    }
}
