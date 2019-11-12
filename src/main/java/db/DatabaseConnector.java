package main.java.db;

import java.sql.Connection;

class DatabaseConnector {
    Connection connection;

    {
        //TODO здесь подключение к базе
    }

    public Connection getConnection() {
        return connection;
    }
}
