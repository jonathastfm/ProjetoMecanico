package pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionCrud {

    private final String url = "jdbc:postgresql://localhost:5432/ProjetoMecanico";
    private final String user = "postgres";
    private final String password = "0512";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ConectionCrud app = new ConectionCrud();
        Connection conn = app.connect();
        app.close(conn);
    }
}