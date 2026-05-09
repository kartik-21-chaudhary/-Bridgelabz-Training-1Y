import java.sql.*;
import java.util.Scanner;

class MovieSystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Movie");
            System.out.println("2 Show Available Movies");
            System.out.println("3 Book Ticket");
            System.out.println("4 Delete Movie");
            System.out.println("5 Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    PreparedStatement ps =
                            con.prepareStatement("INSERT INTO movies VALUES(?,?,?)");

                    ps.setInt(1, sc.nextInt());
                    ps.setString(2, sc.next());
                    ps.setInt(3, sc.nextInt());

                    ps.executeUpdate();
                    System.out.println("Movie Added");
                    break;

                case 2:
                    ResultSet rs =
                            con.createStatement().executeQuery("SELECT * FROM movies WHERE seats>0");

                    while (rs.next()) {
                        System.out.println(rs.getString(2) + " Seats:" + rs.getInt(3));
                    }
                    break;

                case 3:
                    PreparedStatement ps2 =
                            con.prepareStatement("UPDATE movies SET seats=seats-1 WHERE id=? AND seats>0");

                    ps2.setInt(1, sc.nextInt());

                    int r = ps2.executeUpdate();
                    System.out.println(r > 0 ? "Booked" : "No Seats");
                    break;

                case 4:
                    PreparedStatement ps3 =
                            con.prepareStatement("DELETE FROM movies WHERE id=?");

                    ps3.setInt(1, sc.nextInt());
                    ps3.executeUpdate();
                    break;

                case 5:
                    con.close();
                    return;
            }
        }
    }
}