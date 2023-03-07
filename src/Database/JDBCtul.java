package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtul {
	public static Connection getConnect() {

		Connection c = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql/3360/sinhvien";
			String user = "root";
			String password = "123456";
			c = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	public static void closeConnection() {
		Connection c = null;
		if(c==null) {
try {
	c.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
	}
}
}
