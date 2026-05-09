import java.sql.*;

class EmployeeManager {

    public static void main(String[] args) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps1 =
                con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
        ps1.setInt(1, 1);
        ps1.setString(2, "Aman");
        ps1.setDouble(3, 25000);
        ps1.executeUpdate();

        ResultSet rs =
                con.createStatement().executeQuery("SELECT * FROM employee WHERE salary>30000");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        con.createStatement().executeUpdate(
                "UPDATE employee SET salary = salary * 1.1 WHERE id=1");

        con.createStatement().executeUpdate(
                "DELETE FROM employee WHERE salary < 15000");

        con.close();
    }
}