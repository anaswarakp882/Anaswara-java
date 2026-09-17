import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected Successfully!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute SQL query
            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Display result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int mark = rs.getInt("mark");

                System.out.println(
                    id + " " + name + " " + mark
                );
            }

            // 6. Close connection
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}