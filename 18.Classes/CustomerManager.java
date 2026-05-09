import java.sql.*;

class CustomerManager {

    public static void main(String[] args) throws Exception {

        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO customers VALUES(1,'Aman','9999')");

        ResultSet rs = st.executeQuery(
                "SELECT * FROM customers WHERE name LIKE '%Aman%'");

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }

        st.executeUpdate(
                "UPDATE customers SET phone='8888' WHERE id=1");

        st.executeUpdate(
                "DELETE FROM customers WHERE id=1");

        con.close();
    }
}