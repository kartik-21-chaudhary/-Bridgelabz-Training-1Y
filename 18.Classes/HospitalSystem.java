import java.sql.*;
import java.util.Scanner;

class HospitalSystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Patient");
            System.out.println("2 Search Disease");
            System.out.println("3 Update Disease");
            System.out.println("4 Delete");
            System.out.println("5 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    PreparedStatement ps =
                            con.prepareStatement("INSERT INTO patients VALUES(?,?,?)");

                    ps.setInt(1, sc.nextInt());
                    ps.setString(2, sc.next());
                    ps.setString(3, sc.next());

                    ps.executeUpdate();
                    break;

                case 2:
                    PreparedStatement ps2 =
                            con.prepareStatement("SELECT * FROM patients WHERE disease=?");

                    ps2.setString(1, sc.next());

                    ResultSet rs = ps2.executeQuery();

                    while (rs.next()) {
                        System.out.println(rs.getString(2));
                    }
                    break;

                case 3:
                    PreparedStatement ps3 =
                            con.prepareStatement("UPDATE patients SET disease=? WHERE id=?");

                    ps3.setString(1, sc.next());
                    ps3.setInt(2, sc.nextInt());

                    ps3.executeUpdate();
                    break;

                case 4:
                    PreparedStatement ps4 =
                            con.prepareStatement("DELETE FROM patients WHERE id=?");

                    ps4.setInt(1, sc.nextInt());

                    ps4.executeUpdate();
                    break;

                case 5:
                    con.close();
                    return;
            }
        }
    }
}