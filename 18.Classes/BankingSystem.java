import java.sql.*;
import java.util.Scanner;

class BankingSystem {

    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASS);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Account");
            System.out.println("2. Show Accounts > 10000");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter AccNo: ");
                    int acc = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    PreparedStatement ps =
                            con.prepareStatement("INSERT INTO accounts VALUES(?,?,?)");

                    ps.setInt(1, acc);
                    ps.setString(2, name);
                    ps.setDouble(3, bal);

                    ps.executeUpdate();

                    System.out.println("Account Added");
                    break;

                case 2:
                    Statement st = con.createStatement();

                    ResultSet rs =
                            st.executeQuery("SELECT * FROM accounts WHERE balance > 10000");

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("accNo") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("balance"));
                    }
                    break;

                case 3:
                    System.out.print("Enter AccNo: ");
                    int accNo1 = sc.nextInt();

                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();

                    PreparedStatement ps2 =
                            con.prepareStatement(
                                    "UPDATE accounts SET balance = balance + ? WHERE accNo=?");

                    ps2.setDouble(1, dep);
                    ps2.setInt(2, accNo1);

                    ps2.executeUpdate();

                    System.out.println("Amount Deposited");
                    break;

                case 4:
                    System.out.print("Enter AccNo: ");
                    int accNo2 = sc.nextInt();

                    System.out.print("Enter Amount to Withdraw: ");
                    double wd = sc.nextDouble();

                    PreparedStatement ps3 =
                            con.prepareStatement(
                                    "UPDATE accounts SET balance = balance - ? WHERE accNo=? AND balance>=?");

                    ps3.setDouble(1, wd);
                    ps3.setInt(2, accNo2);
                    ps3.setDouble(3, wd);

                    int rows = ps3.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 5:
                    System.out.print("Enter AccNo to delete: ");
                    int accNo3 = sc.nextInt();

                    PreparedStatement ps4 =
                            con.prepareStatement("DELETE FROM accounts WHERE accNo=?");

                    ps4.setInt(1, accNo3);

                    ps4.executeUpdate();

                    System.out.println("Account Deleted");
                    break;

                case 6:
                    con.close();
                    System.out.println("Exited");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}