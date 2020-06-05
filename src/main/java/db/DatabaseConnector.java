package main.java.db;

import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;

public class DatabaseConnector implements Serializable {
    // @Resource(name = "jdbc/root")
    DataSource dataSource;

    private Connection connection;

    {
        // TODO здесь подключение к базе
        // try {
        // connection = dataSource.getConnection();
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
