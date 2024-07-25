package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	static Connection con = null;

    public static Connection connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root", "Chethan_57");
        }
        catch (Exception var1) {
            System.out.print(var1);
        }

        return con;
    }

}
