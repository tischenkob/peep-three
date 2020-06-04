package main.java.db;

import javax.faces.annotation.ManagedProperty;
import java.io.Serializable;
import java.sql.Connection;

public class DatabaseChanger implements Serializable {
    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
