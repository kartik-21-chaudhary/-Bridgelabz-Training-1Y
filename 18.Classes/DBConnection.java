import java.sql.*;

class DBConnection {

    static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(url, user, pass);
    }
}