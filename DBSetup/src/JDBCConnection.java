import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("driver loaded");
        DriverManager.getConnection("jdbc:mysql://localhost:3306/Simpli", "root", "Akhila@11");
        System.out.println("Connection established");
    }
}