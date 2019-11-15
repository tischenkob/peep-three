package main.java.db;

import main.java.beans.EntryBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseExtractor extends DatabaseChanger {
    Statement statement = connection.createStatement();
    String query = "SELECT FROM entries";

    public DatabaseExtractor() throws SQLException {
    }

    public List<EntryBean> getHistoryList() throws SQLException {
        // TODO тут добываем список точек

        ResultSet resultSet = statement.executeQuery(query);

        List<EntryBean> entries = getEntriesFrom(resultSet);

        return entries;
    }

    private List<EntryBean> getEntriesFrom(ResultSet resultSet) throws SQLException {
        List<EntryBean> entries = new ArrayList<>();
        while (resultSet.next()) {
            entries.add(getEntryFrom(resultSet));
        }
        return entries;
    }

    private EntryBean getEntryFrom(ResultSet resultSet) {
        return null;
    }
}
