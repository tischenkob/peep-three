package main.java.db;

import java.io.Serializable;
import java.sql.Connection;

public class DatabaseChanger implements Serializable {
    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
