package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvider {
    static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
