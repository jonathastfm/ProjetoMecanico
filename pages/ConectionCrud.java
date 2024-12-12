package pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class ConectionCrud {

    private final String url = "jdbc:postgresql://localhost:5432/ProjetoMecanico";
    private final String user = "postgres";
    private final String password = "0512";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProjetoMecanico", "postgres", "0512");
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

    public Map<String, Object> getRow(String table, String idname, String id) {
        Map<String, Object> row = new HashMap<>();
        String SQL = "SELECT * FROM " + table + " WHERE " + idname + " = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                row.put("id", rs.getInt("id"));
                row.put("column1", rs.getString("column1"));
                row.put("column2", rs.getString("column2"));
                // Add more columns as needed
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }

    public static void main(String[] args) {
        ConectionCrud app = new ConectionCrud();
        Connection conn = app.connect();
        app.close(conn);
    }
}