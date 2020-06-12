package main.java.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableService extends DatabaseChanger {
    Statement statement = connection.createStatement();
    String tableStatement = "CREATE TABLE IF NOT EXISTS";

    public TableService() throws SQLException {
    }

    public void createTable(Connection connection) throws SQLException {
        statement.execute(tableStatement);
    }
}
