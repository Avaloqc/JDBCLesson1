package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory () {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection () {
        Connection conx;
        String url = "jdbc:mysql://localhost:3306/test";

        try {
            conx = DriverManager.getConnection(url, "root", "12345");

        } catch (SQLException e) {
            System.out.println("FALHA ao tentar criar conexão");
            throw new RuntimeException(e);

        }
        return conx;
    }
}

