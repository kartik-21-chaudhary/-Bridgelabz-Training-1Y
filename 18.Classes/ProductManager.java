import java.sql.*;

class ProductManager {

    public static void main(String[] args) throws Exception {

        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        st.executeUpdate("INSERT INTO product VALUES(1,'Pen',5)");
        st.executeUpdate("INSERT INTO product VALUES(2,'Book',20)");
        st.executeUpdate("INSERT INTO product VALUES(3,'Bag',8)");

        ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty<10");

        while (rs.next()) {
            System.out.println(rs.getString("pname"));
        }

        st.executeUpdate("UPDATE product SET qty=qty+10 WHERE pid=1");

        st.executeUpdate("DELETE FROM product WHERE pid=3");

        con.close();
    }
}