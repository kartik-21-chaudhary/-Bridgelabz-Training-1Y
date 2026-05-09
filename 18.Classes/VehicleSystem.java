import java.sql.*;
import java.util.Scanner;

class VehicleSystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Vehicle");
            System.out.println("2 Show Pending");
            System.out.println("3 Mark Completed");
            System.out.println("4 Delete");
            System.out.println("5 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    PreparedStatement ps =
                            con.prepareStatement("INSERT INTO vehicles VALUES(?,?,?)");

                    ps.setString(1, sc.next());
                    ps.setString(2, sc.next());
                    ps.setString(3, "Pending");

                    ps.executeUpdate();
                    break;

                case 2:
                    ResultSet rs =
                            con.createStatement().executeQuery("SELECT * FROM vehicles WHERE status='Pending'");

                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                    }
                    break;

                case 3:
                    PreparedStatement ps2 =
                            con.prepareStatement("UPDATE vehicles SET status='Completed' WHERE regNo=?");

                    ps2.setString(1, sc.next());

                    ps2.executeUpdate();
                    break;

                case 4:
                    PreparedStatement ps3 =
                            con.prepareStatement("DELETE FROM vehicles WHERE regNo=?");

                    ps3.setString(1, sc.next());

                    ps3.executeUpdate();
                    break;

                case 5:
                    con.close();
                    return;
            }
        }
    }
}