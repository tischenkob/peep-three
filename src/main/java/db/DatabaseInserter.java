package main.java.db;

import main.java.beans.EntryBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TODO переделать под datasource injection!!!

public class DatabaseInserter {
    private PreparedStatement addStatement;

    {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.getConnection();
        try {
            String addStatementString = "INSERT INTO s265063.entries(session_id, x, y, r, hit)" +
                    " values(?, ?, ?, ?, ?)";
            addStatement = connection.prepareStatement(addStatementString);
        } catch (SQLException e) {
            System.err.println("Couldn't prepare statement");
        }
    }

    public void addEntry(EntryBean entry) throws SQLException {
        fillStatement(addStatement, entry);
        addStatement.execute();
    }

    private void fillStatement(PreparedStatement statement, EntryBean entry) throws SQLException {
        double x = entry.getX();
        double y = entry.getY();
        double r = entry.getR();
        boolean hit = entry.isHit();

        statement.setDouble(0, x);
        statement.setDouble(1, y);
        statement.setDouble(2, r);
        statement.setBoolean(3, hit);
    }
}
