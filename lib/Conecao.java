
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Conecao {
    private static final String URL = "jdbc:mysql://localhost:3306/meu_banco";
    private static final String USER = "usuario";
    private static final String PASSWORD = "senha";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver não encontrado", e);
        }
    }

}
