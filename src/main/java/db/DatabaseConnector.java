package main.java.db;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;

public class DatabaseConnector implements Serializable {
    DataSource dataSource;

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
